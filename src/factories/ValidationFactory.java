package factories;

import java.util.ArrayList;

import utils.ApplicationArguments;
import validation.RequiredParam;
import validation.Validation;
import validation.ValidatorComposite;

public class ValidationFactory {
  
  public Validation makeValidation() {
    ArrayList<Validation> validations = new ArrayList<>();
    validations.add(new RequiredParam(ApplicationArguments.getArgumentByKey("-i")));

    return new ValidatorComposite(validations);
  }
}
