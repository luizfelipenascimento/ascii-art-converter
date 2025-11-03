import java.awt.image.BufferedImage;
import java.io.IOException;

import converter.RequestedConfiguration;
import factories.ConfigurationFactory;
import factories.ValidationFactory;
import converter.AsciiArtConverter;
import converter.ImageLoader;
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

      Validation requestValidation = new ValidationFactory().makeValidation();
      Error error = requestValidation.validate(args);
      if (error != null) {
        Display.error(error);
        System.exit(1);
      }

      RequestedConfiguration config = new ConfigurationFactory(args)
          .getRequestedConfiguration();

      BufferedImage img = ImageLoader.load(config.getImagePath());
      char[] asciiResult = AsciiArtConverter.convert(img, config);
      Display.asciiArrayImage(asciiResult, img.getWidth(), img.getHeight(), config.getOutputColor());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}