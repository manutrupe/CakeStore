package com.example.validation;

import com.example.anotation.ValidCake;
import com.example.order.model.Cake;
import com.example.order.model.CakeSize;
import com.example.order.model.CakeType;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CakeValidator implements ConstraintValidator<ValidCake, Cake> {
    @Override
    public void initialize(ValidCake constraintAnnotation) {
        // Initialization logic if needed
    }

    @Override
    public boolean isValid(Cake cake, ConstraintValidatorContext context) {

        CakeSize size = cake.getSize();
        CakeType type = cake.getType();

        return switch (type) {
            case LUNCH_BOX -> size == CakeSize.LUNCH_BOX;
            case TWO_TIER -> size == CakeSize.MEDIANO || size == CakeSize.GRANDE;
            case CORAZON, CIRCULAR, VINTAGE -> size == CakeSize.LUNCH_BOX || size == CakeSize.PETIT ||
                    size == CakeSize.CHICO || size == CakeSize.MEDIANO ||
                    size == CakeSize.GRANDE;
            default -> false;
        };
    }
}
