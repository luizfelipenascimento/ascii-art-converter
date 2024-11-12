package converter;

import java.awt.image.BufferedImage;

public class ConvertionMethods {
  public enum Options { RGB_TO_AVARAGE_BRIGHTNESS }

  public static int[] rgbToAverageBrightness (BufferedImage image) {
    int[] rgbArray = image.getRGB(0, 0, image.getWidth(), image.getHeight(), null, 0, image.getWidth());
    int[] pixelArray = new int[image.getWidth() * image.getHeight()];
    for (int i =  0; i < pixelArray.length; i++) {
      pixelArray[i] = ((rgbArray[i] >> 16 & 0xff) + (rgbArray[i] >> 8 & 0xff) + (rgbArray[i] & 0xff)) / 3;
    }
    return pixelArray;
  }
}
