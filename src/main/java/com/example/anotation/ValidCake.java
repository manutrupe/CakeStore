package com.example.anotation;

import com.example.validation.CakeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CakeValidator.class)
public @interface ValidCake {
    String message() default "Invalid cake type and size combination";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
