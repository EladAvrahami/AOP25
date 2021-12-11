package com.jb.springStarter.AOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
/*מסמל על מה האנוטציה שיצרנו מתבייטת*/
@Target({METHOD,FIELD})/*על מתודות ושדות במקרה זה */
@Retention(RUNTIME)
public @interface SendIvgeny {
}
