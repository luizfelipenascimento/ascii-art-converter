package errors;

import utils.ApplicationArguments;
import utils.ApplicationArguments.Argument;

public class MissingParameterError extends Error {
  private String details;
  
  public MissingParameterError(String param) {
    super("MissingParameterError");
    Argument arg = ApplicationArguments.getArgumentByKey(param);
    details = arg.key + ": " + arg.details + " param is required";
  }

  @Override
  public String toString() {
    return this.getMessage() + ": " + details;
  }
}
