package model.impl;

import model.contract.IShape2D;
import model.contract.Translatable2D;

public abstract class Shape2D extends Shape implements IShape2D, Translatable2D {

    private Point2D refPoint;

    public Shape2D(Point2D point2D) {
        this.refPoint = point2D;
    }

    public abstract double perimeter();

    @Override
    public void translate(double x, double y) {
        getRefPoint().translate(x, y);
    }

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }
}



