package errors;

import utils.ApplicationArguments.Argument;

public class MissingParameterException extends IllegalArgumentException {
  private String details;
  
  public MissingParameterException(Argument argument) {
    super("MissingParameterError");
    details = argument.key + ": " + argument.details + " param is required";
  }

  @Override
  public String toString() {
    return this.getMessage() + ": " + details;
  }
}
