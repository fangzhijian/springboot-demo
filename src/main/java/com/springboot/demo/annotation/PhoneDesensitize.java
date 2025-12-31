package com.springboot.demo.annotation;

import org.mapstruct.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * {@code @description} 身份证号脱敏注解
 *
 * @author fangzhijian
 * @since 2025-12-29 14:20
 */
@Qualifier
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PhoneDesensitize {

}
