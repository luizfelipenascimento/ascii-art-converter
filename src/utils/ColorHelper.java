package utils;

public class ColorHelper {
  public static OutputColor getColor (String color) {
    switch (color) {
      case "red":
        return OutputColor.ANSI_RED;
      case "green":
        return OutputColor.ANSI_GREEN;
      case "yellow":
        return OutputColor.ANSI_YELLOW;
      case "blue":
        return OutputColor.ANSI_BLUE;
      case "purple":
        return OutputColor.ANSI_PURPLE;
      case "cyan":
        return OutputColor.ANSI_CYAN;
      default:
        return OutputColor.ANSI_WHITE;
    }
  }

  private ColorHelper() {}
}
