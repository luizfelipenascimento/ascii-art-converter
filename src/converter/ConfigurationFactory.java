package converter;

import utils.ColorHelper;

public class ConfigurationFactory {
  
  private String[] input;

  public ConfigurationFactory(String[] input) {
    this.input = input;
  }

  public RequestedConfiguration getRequestedConfiguration () {
    RequestedConfiguration config = new RequestedConfiguration();
    for (int i = 0; i < input.length; i++) {
      if (input[i].equals("-i")) {
        config.setImagePath(input[i + 1]);
        continue;
      }
      
      if (input[i].equals("-color")) {
        config.setOutputcolor(ColorHelper.getColor(input[i + 1]));
        continue;
      }

      if (input[i].equals("-filter")) {
        config.setFilterMethod(input[i + 1]);
        continue;
      }
    }
    return config;
  }
}
