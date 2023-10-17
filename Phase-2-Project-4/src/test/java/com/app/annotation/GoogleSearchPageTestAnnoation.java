package com.app.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Target({ElementType.TYPE, ElementType.METHOD}) // where will annotation be applied- on a method
@Retention(RetentionPolicy.RUNTIME) // when will annotation be triggered
@DisplayName("Google Search Engine Test")
@ParameterizedTest(name = "Check Search {arguments}")
@ValueSource(strings={"Wikipedia"})
public @interface GoogleSearchPageTestAnnoation {
	
}