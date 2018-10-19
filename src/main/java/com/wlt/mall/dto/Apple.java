package com.wlt.mall.dto;

import com.wlt.mall.Anno.FruitName;
import com.wlt.mall.Anno.FruitColor;

public class Apple {

    @FruitName("测试Apple")
    private String appleName;

    @FruitColor(color = FruitColor.Color.GREEN)
    private String appleColor;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    @Override
    public String toString() {
        return "Apple [appleName=" + appleName + ", appleColor=" + appleColor + "]";
    }

}