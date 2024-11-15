package utils;

import converter.FiltersMethods;

public class FilterHelper {
  
  public FiltersMethods.Options getFilterOption(String filtername) {
    switch (filtername) {
      case "avarage-brightness":
        return FiltersMethods.Options.RGB_TO_AVARAGE_BRIGHTNESS;
      default:
        return FiltersMethods.Options.RGB_TO_AVARAGE_BRIGHTNESS;
    }
  }

  private FilterHelper () {}
}
