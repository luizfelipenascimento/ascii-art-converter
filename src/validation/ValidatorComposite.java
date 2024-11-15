package validation;

import java.util.ArrayList;

public class ValidatorComposite implements Validation {

  private ArrayList<Validation> validations; 

  public ValidatorComposite(ArrayList<Validation> validations) {
    this.validations = validations;
  }

  @Override
  public Error validate(String[] input) {
    for (Validation validation : validations) {
      Error error = validation.validate(input);
      if (error != null) return error;
    }
    return null;
  }
  
}
