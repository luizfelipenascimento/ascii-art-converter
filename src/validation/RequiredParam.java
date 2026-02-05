package validation;

import errors.MissingParameterException;
import utils.ApplicationArguments.Argument;

public class RequiredParam implements Validation {
  private Argument requiredArgument;

  public RequiredParam(Argument requiredArgument) {
    this.requiredArgument = requiredArgument;
  }

  @Override
  public Error validate(String[] input) {
    for (String param : input) {
      if (param.equals(requiredArgument.key) || param.equals(requiredArgument.altKey)) {
        return null;
      }
    }
    throw new MissingParameterException(requiredArgument);
  }
}
