package com.jb.springStarter.AOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

//where the annotations will be used (type(enum),c'tor,method,field,class)
@Target({ METHOD })
//the annotation will be run at run time.....
@Retention(RUNTIME)
public @interface SendSMS {// create an annotation -put @ befor interface

}
