package utils;

import java.util.Collection;
import java.util.HashMap;

import models.AsciiColor;

public class ColorHelper {

  private final static HashMap<String, AsciiColor> colorMap = new HashMap<>() {{
    put("red", new AsciiColor("red", OutputColor.ANSI_RED, 0xFF0000));
    put("green", new AsciiColor("green", OutputColor.ANSI_GREEN, 0x00FF00));
    put("yellow", new AsciiColor("yellow", OutputColor.ANSI_YELLOW, 0xFFFF00));
    put("blue", new AsciiColor("blue", OutputColor.ANSI_BLUE , 0x0000FF));
    put("purple", new AsciiColor("purple", OutputColor.ANSI_PURPLE , 0x800080));
    put("cyan", new AsciiColor("cyan", OutputColor.ANSI_CYAN, 0x00FFFF));
    put("white", new AsciiColor("white", OutputColor.ANSI_WHITE, 0xFFFFFF));
  }};

  public static AsciiColor getAsciiColor (String color) {
    return colorMap.get(color);
  }

  public static Collection<AsciiColor> getColorsValues () {
    return colorMap.values();
  }

  public static OutputColor getColorCode (String color) {
    if (color.equals(OutputColor.COLORFUL.toString())) {
      return OutputColor.COLORFUL;
    }
    
    AsciiColor asciiColor = colorMap.get(color);
    
    if (asciiColor == null) 
      return OutputColor.ANSI_WHITE;
    
    return asciiColor.getOutputColor();
  }

  private ColorHelper() {}
}
