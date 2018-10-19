package com.wlt.mall.Anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 定义一个注解类,指定对类和方法有效,在运行期有效
 * 注解很像接口，对属性的定义类似于接口中方法的定义，
 * 需要使用括号（）
 * @author Realfighter
 *
 */
@Target( { ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Authority {

    /**
     *  名称,这里使用default指定默认值,
     在使用注解的时候不指定name,则为默认值
     */
    String name() default "";

    String describe();// 描述

}
