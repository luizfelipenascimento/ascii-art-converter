import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import converter.ConvertionMethods;
import converter.AsciiArtConverter;
import utils.Display;

class App {

  public static void main(String[] args) {
      
      try {
        File file = new File("imgs/ascii-pineapple.jpg");
        BufferedImage img = ImageIO.read(file);
        System.out.println("Successfully loaded image!");
        System.out.println("Image Size: " + img.getWidth() + " x " + img.getHeight());
        char[] asciiResult = AsciiArtConverter.convert(img, ConvertionMethods.Options.RGB_TO_AVARAGE_BRIGHTNESS);
        Display.asciiArrayImage(asciiResult, img.getWidth(), img.getHeight());
        
      } catch (IOException e) {
        e.printStackTrace();
      }
      
  }
}