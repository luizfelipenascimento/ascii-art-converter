package utils;

public class Display {
  public static void error(Exception error) {
    System.out.println(OutputColor.ANSI_RED.toString() + " " +error.toString());
    System.out.print(OutputColor.ANSI_RESET);
  }

  public static void arrayValues (int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void arrayValues (byte[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }

  public static void rgbValues (int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.format("bytes: %h - RED: %h - GREEN: %h - BLUE: %h\n", array[i] & 0xffffffL, array[i] >> 16 & 0xff, array[i] >> 8 & 0xff, array[i] & 0xff);
      System.out.format("bytes: %d - RED: %d - GREEN: %d - BLUE: %d\n", array[i] & 0xffffffL, array[i] >> 16 & 0xff, array[i] >> 8 & 0xff, array[i] & 0xff);
    }
  }

  public static void asciiArrayImage (char[] array, int width, int height, OutputColor color) {
    System.out.print(color);
    for (int i = 0; i < array.length; i++) {
      if(i % width == 0) System.err.println();
      System.out.print(array[i]);
    }
  }

  public static void asciiArrayColourfullImage (char[] array, String[] ANSIArray, int width, int height) {  
    for (int i = 0; i < array.length; i++) {
      if(i % width == 0) System.err.println();
      System.out.print(ANSIArray[i]);
      System.out.print(array[i]);
    }
  }

  public static String helpContent() {
    return "Usage: java -jar ascii-art-converter.jar -i <image_path> [-color <color>] [-filter <filter_method>]\n" +
         "Options:\n" +
         "  -i, --image <image_path>   Path to the image file to convert.\n" +
         "  -color <color>             Output color for the ASCII art (default: white).\n" +
         "      Available colors: red, green, yellow, blue, purple, cyan, white, colorful\n" +
         "  -filter <filter_method>    Filter method to apply (e.g., 'nearest', 'bilinear').\n" +
         "  -h, --help                 Display this help message.";
  }
}
