package converter;

import utils.OutputColor;

public class RequestedConfiguration {
  private OutputColor outputColour = OutputColor.ANSI_WHITE;
  private FiltersMethods.Options method = FiltersMethods.Options.RGB_TO_AVARAGE_BRIGHTNESS;
  private String imagePath;

  public void setOutputcolor (OutputColor color) {
    this.outputColour = color;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }

  public String getImagePath() {
    return this.imagePath;
  }
  
  public OutputColor getOutputColor() {
    return this.outputColour;
  }

  public FiltersMethods.Options getConvertionMethod() {
    return this.method;
  }

  public void setFilterMethod (String filtername) {

  }
}
