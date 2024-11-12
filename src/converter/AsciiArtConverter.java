package converter;

public class AsciiArtConverter {

  private final static String mapChars = "`^\",:;Il!i~+_-?][}{1)(|\\/tfjrxnuvczXYUJCLQ0OZmwqpdbkhao*#MW&8%B@$"; 

  public static char[] convert (int[] rgbArray, int width, int height, ConvertionMethods.Options method) {
    int[] pixelArray = ConvertionMethods.rgbToAverageBrightness(rgbArray, width, height);
    char[] asciiPixel = new char[width * height];
    
    for (int i = 0; i < asciiPixel.length; i++) {
      int index = (int)((pixelArray[i] / 255.0) * (mapChars.length() - 1));
      asciiPixel[i] = mapChars.charAt(index);
    }

    return asciiPixel;
  }
}
