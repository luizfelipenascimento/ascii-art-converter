package validation;

import Errors.MissingParameterError;

public class RequiredParam implements Validation {
  private String requiredParam;

  public RequiredParam(String requiredParam) {
    this.requiredParam = requiredParam;
  }

  @Override
  public Error validate(String[] input) {
    for (String param : input) {
      if (param.equals(requiredParam)) {
        return null;
      }
    }
    return new MissingParameterError(requiredParam);
  }
}
