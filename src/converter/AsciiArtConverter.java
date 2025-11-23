package converter;
import java.awt.image.BufferedImage;

public class AsciiArtConverter {

  public static char[] convert (BufferedImage image, RequestedConfiguration config) {
    int[] pixelArray = FiltersMethods.rgbToAverageBrightness(image);
    char[] asciiPixel = new char[image.getWidth() * image.getHeight()];
    ImageCharacterMapper mapper = new ImageCharacterMapper();
    for (int i = 0; i < asciiPixel.length; i++) {
      asciiPixel[i] = mapper.map(pixelArray[i]);
    }
    return asciiPixel;
  }
}
