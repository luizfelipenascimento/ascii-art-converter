package models;

import utils.OutputColor;

public class AsciiColor {
  private String name;
  private OutputColor outputColor;
  private int rgb;

  public AsciiColor(String name, OutputColor outputColor, int rgb) {
    this.name = name;
    this.outputColor = outputColor;
    this.rgb = rgb;
  }

  public OutputColor getOutputColor() {
    return this.outputColor;
  }

  public int getRgb() {
    return this.rgb;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public String toString() {
    return this.name;
  }
}
