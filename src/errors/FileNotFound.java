package errors;

public class FileNotFound extends RuntimeException {
  private String details;
  
  public FileNotFound(String path) {
    super("FileNotFound");
    details = path + ": file does not exists";
  }

  @Override
  public String toString() {
    return this.getMessage() + ": " + details;
  }

}
