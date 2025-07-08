import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import converter.RequestedConfiguration;
import errors.FileNotFound;
import factories.ConfigurationFactory;
import factories.ValidationFactory;
import converter.AsciiArtConverter;
import utils.Display;
import validation.Validation;

class App {

  public static void main(String[] args) {
    try {
      for (String arg : args) {
        if (arg.equals("-h") || arg.equals("--help")) {
          System.out.println(Display.helpContent());
          System.exit(0);
        }
      }

      Validation validation = new ValidationFactory().makeValidation();
      Error error = validation.validate(args);
      if (error != null) {
        Display.error(error);
        System.exit(1);
      }

      RequestedConfiguration config = new ConfigurationFactory(args)
          .getRequestedConfiguration();

      File file;
      file = new File(config.getImagePath());

      if (!file.exists()) {
        Display.error(new FileNotFound(file.getAbsolutePath()));
        System.exit(1);
      }

      
      BufferedImage img = ImageIO.read(file);
      System.out.println("Successfully loaded image!");
      System.out.println("Image Size: " + img.getWidth() + " x " + img.getHeight());
      char[] asciiResult = AsciiArtConverter.convert(img, config);
      Display.asciiArrayImage(asciiResult, img.getWidth(), img.getHeight(), config.getOutputColor());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}