package org.ancit.sample.eap.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@javax.inject.Qualifier
@Documented
@Retention(RUNTIME)
@Target({ElementType.FIELD,ElementType.PARAMETER})
public @interface Person {

	String name();
}
