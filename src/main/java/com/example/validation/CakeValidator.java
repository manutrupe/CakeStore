package com.example.validation;

import com.example.anotation.ValidCake;
import com.example.order.model.Cake;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CakeValidator implements ConstraintValidator<ValidCake, Cake> {
    @Override
    public void initialize(ValidCake constraintAnnotation) {
        // Initialization logic if needed
    }

    @Override
    public boolean isValid(Cake cake, ConstraintValidatorContext context) {

        Cake.SizeEnum size = cake.getSize();
        Cake.TypeEnum type = cake.getType();

        return switch (type) {
            case LUNCH_BOX -> size == Cake.SizeEnum.LUNCH_BOX;
            case TWO_TIER -> size == Cake.SizeEnum.MEDIANO || size == Cake.SizeEnum.GRANDE;
            case CORAZON, CIRCULAR, VINTAGE -> size == Cake.SizeEnum.LUNCH_BOX || size == Cake.SizeEnum.PETIT ||
                    size == Cake.SizeEnum.CHICO || size == Cake.SizeEnum.MEDIANO ||
                    size == Cake.SizeEnum.GRANDE;
            default -> false;
        };
    }
}
