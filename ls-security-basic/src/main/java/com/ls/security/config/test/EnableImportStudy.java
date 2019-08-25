package com.ls.security.config.test;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(SpringImportStudySelector.class)
public @interface EnableImportStudy {

}
