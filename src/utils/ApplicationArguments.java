package utils;

public class ApplicationArguments {
  
  static final Argument[] allowedArguments = {
    new Argument("-i", "Image path", "--image"),
    new Argument("-color", "Color attribute"),
    new Argument("-filter", "Filter attribute")
  }; 

  public static Argument getArgumentByKey(String key) {
    for (Argument arg : allowedArguments) {
      if (arg.key.equals(key) || arg.altName != null && arg.altName.equals(key)) {
        return arg;
      }
    }
    return null;
  }

  public static class Argument {
    public final String key;
    public final String altName;
    public final String details;
    
    public Argument(String key, String details, String altName) {
      this.key = key;
      this.altName = altName;
      this.details = details;
    }

    public Argument(String key, String details) {
      this.key = key;
      this.details = details;
      this.altName = null;
    }
  }
}
