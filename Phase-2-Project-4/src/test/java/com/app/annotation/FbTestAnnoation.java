package com.app.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@Target({ElementType.TYPE, ElementType.METHOD}) // where will annotation be applied- on a method
@Retention(RetentionPolicy.RUNTIME) // when will annotation be triggered
@DisplayName("Facebook Log In Page Test")
@ParameterizedTest(name = "Csv source {arguments}")
@CsvSource({"Asish, Asish"})
public @interface FbTestAnnoation {
	
}