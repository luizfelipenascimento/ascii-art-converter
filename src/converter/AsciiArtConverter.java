package converter;
import java.awt.image.BufferedImage;

public class AsciiArtConverter {

  private final static String mapChars = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$"; 

  public static char[] convert (BufferedImage image, RequestedConfiguration config) {
    
    int[] pixelArray = FiltersMethods.rgbToAverageBrightness(image);
    char[] asciiPixel = new char[image.getWidth() * image.getHeight()];
    for (int i = 0; i < asciiPixel.length; i++) {
      int index = (int)((pixelArray[i] / 255.0) * (mapChars.length() - 1));
      asciiPixel[i] = mapChars.charAt(index);
    }

    return asciiPixel;
  }
}
