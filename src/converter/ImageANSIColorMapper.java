package converter;

import java.util.Collection;

import models.AsciiColor;
import utils.ColorHelper;

public class ImageANSIColorMapper {

  public static String[] map (int[] pixelArray) {
    String[] asciiColorArray = new String[pixelArray.length];
    double closestValue = Double.MAX_VALUE;
    Collection<AsciiColor> colors = ColorHelper.getColorsValues();
    AsciiColor closestColor = null;
    for (int i = 0; i < pixelArray.length; i++) {
      int x1 = pixelArray[i] >> 16 & 0xff; 
      int y1 = pixelArray[i] >> 8 & 0xff; 
      int z1 = pixelArray[i] & 0xff;
      
      for (AsciiColor color : colors) {
        int rgbColor = color.getRgb();
        int x2 = rgbColor >> 16 & 0xff; 
        int y2 = rgbColor >> 8 & 0xff;
        int z2 = rgbColor & 0xff;

        double distance = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2); 
        
        if (distance < closestValue) {
          closestValue = distance;
          closestColor = color;
        }      
      }
      asciiColorArray[i] = closestColor.getOutputColor().toString();
      closestValue = Double.MAX_VALUE;
    }

    return asciiColorArray;
  }
}
