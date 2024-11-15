package utils;

public class Display {

  
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

  public static void asciiArrayImage (char[] array, int width, int height) {
    for (int i = 0; i < array.length; i++) {
      if(i % width == 0) System.err.println();
      System.out.print(array[i]);
    }
  }
}
