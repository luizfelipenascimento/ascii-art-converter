import java.awt.image.BufferedImage;

import converter.RequestedConfiguration;
import factories.ConfigurationFactory;
import factories.ValidationFactory;
import converter.AsciiArtConverter;
import converter.ImageANSIColorMapper;
import converter.ImageLoader;
import utils.Display;
import utils.OutputColor;
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
      requestValidation.validate(args);
  
      RequestedConfiguration config = new ConfigurationFactory(args)
          .getRequestedConfiguration();

      BufferedImage img = ImageLoader.load(config.getImagePath());
      char[] asciiResult = AsciiArtConverter.convert(img, config);

      OutputColor outputColor = config.getOutputColor();
      
      if (outputColor.equals(OutputColor.COLORFUL)) {
        int[] imRGB = img.getRGB(0, 0, img.getWidth(), img.getHeight(), null, 0, img.getWidth());
        Display.asciiArrayColourfullImage(asciiResult, ImageANSIColorMapper.map(imRGB), img.getWidth(), img.getHeight());
      }
      else {
        Display.asciiArrayImage(asciiResult, img.getWidth(), img.getHeight(), outputColor);
      }
      
    } catch (Exception e) {
      if (e instanceof IllegalArgumentException argumentException) {
         Display.error(argumentException);
         System.exit(1);
      }
    }
  }
}