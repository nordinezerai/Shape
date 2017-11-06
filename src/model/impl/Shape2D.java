package model.impl;

import model.contract.IShape2D;

public abstract class Shape2D extends Shape implements IShape2D {

    Point2D refPoint = new Point2D();

    @Override
    public double perimeter() {
        return 0;
    }

}
