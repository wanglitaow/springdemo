package com.wlt.mall.serivce;

import com.wlt.mall.Anno.FruitName;
import com.wlt.mall.Anno.FruitColor;

import java.lang.reflect.Field;

public class AnnoService {

    public static void getFruitInfo(Class<?> fruitClass) {
        Field[] fields = fruitClass.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println("水果名称： " + fruitName.value());
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println("水果颜色： " + fruitColor.color().getName());
            }
        }

    }

}
