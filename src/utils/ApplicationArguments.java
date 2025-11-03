package utils;

public class ApplicationArguments {
  
  static final Argument[] allowedArguments = {
    new Argument("-i", "Image path", "--image"),
    new Argument("-color", "Color attribute"),
    new Argument("-filter", "Filter attribute")
  }; 

  public static Argument getArgumentByKey(String key) {
    for (Argument arg : allowedArguments) {
      if (arg.key.equals(key) || arg.altKey != null && arg.altKey.equals(key)) {
        return arg;
      }
    }
    return null;
  }

  public static class Argument {
    public final String key;
    public final String altKey;
    public final String details;
    
    public Argument(String key, String details, String altKey) {
      this.key = key;
      this.altKey = altKey;
      this.details = details;
    }

    public Argument(String key, String details) {
      this.key = key;
      this.details = details;
      this.altKey = null;
    }
  }
}
