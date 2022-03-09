package com.kirito.design.impl;

import com.kirito.design.ICalculationArea;

/**
 * @description: 扩展继承，实现自己的需求
 */
public class CalculationAreaExt implements ICalculationArea {
    private final static double Π=3.141592653D;
    @Override
    public double circular(double r) {
        return Π*r*r;
    }
}
