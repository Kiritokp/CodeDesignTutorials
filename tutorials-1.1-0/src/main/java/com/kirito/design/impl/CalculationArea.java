package com.kirito.design.impl;

import com.kirito.design.ICalculationArea;

/**
 * @description: 面积计算实现
 */
public class CalculationArea implements ICalculationArea {

    private final static double Π=3.14D;
    @Override
    public double circular(double r) {
        return Π*r*r;
    }
}
