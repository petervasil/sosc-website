package com.annotations;

import com.enums.ElementType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface ElementDesc {

    ElementType elementType();
    String xPath();
}
