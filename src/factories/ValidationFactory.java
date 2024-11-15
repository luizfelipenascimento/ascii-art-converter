package factories;

import java.util.ArrayList;

import validation.RequiredParam;
import validation.Validation;
import validation.ValidatorComposite;

public class ValidationFactory {
  
  public Validation makeValidation() {
    ArrayList<Validation> validations = new ArrayList<>();
    validations.add(new RequiredParam("-i"));

    return new ValidatorComposite(validations);
  }
}
