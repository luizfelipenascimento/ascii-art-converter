package errors;

public class MissingParameterError extends Error {
  private String details;
  
  public MissingParameterError(String input) {
    super("MissingParameterError");
    details = input + " param is required";
  }

  @Override
  public String toString() {
    return this.getMessage() + ": " + details;
  }
}
