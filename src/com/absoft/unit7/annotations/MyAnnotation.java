package com.absoft.unit7.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD,ElementType.METHOD,ElementType.CONSTRUCTOR})
public @interface MyAnnotation {
    String[] value() default {};

    int myInt();
}
