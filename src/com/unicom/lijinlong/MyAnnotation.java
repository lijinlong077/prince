package com.unicom.lijinlong;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 包类型的注解，只能放在包上
 * @author DELL
 *
 */
@Target(ElementType.PACKAGE)  
@Retention(RetentionPolicy.RUNTIME)  
public @interface MyAnnotation {

}
