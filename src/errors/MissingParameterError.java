package errors;

import utils.ApplicationArguments.Argument;

public class MissingParameterError extends Error {
  private String details;
  
  public MissingParameterError(Argument argument) {
    super("MissingParameterError");
    details = argument.key + ": " + argument.details + " param is required";
  }

  @Override
  public String toString() {
    return this.getMessage() + ": " + details;
  }
}
