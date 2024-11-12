package converter;

public class ConvertionMethods {
  public enum Options { RGB_TO_AVARAGE_BRIGHTNESS }

  public static int[] rgbToAverageBrightness (int[] rgbArray, int width, int height) {
    int[] pixelArray = new int[width * height];
    for (int i =  0; i < pixelArray.length; i++) {
      pixelArray[i] = ((rgbArray[i] >> 16 & 0xff) + (rgbArray[i] >> 8 & 0xff) + (rgbArray[i] & 0xff)) / 3;
    }
    return pixelArray;
  }
}
