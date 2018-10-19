package com.wlt.mall.Anno;

import java.lang.annotation.*;

/**
 * 水果名称注解
 * @author zifangsky
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}