package model.impl;

import model.contract.IShape2D;
import model.contract.Translatable2D;

public abstract class Shape2D extends Shape implements IShape2D, Translatable2D {

    private Point2D refPoint;

    public Shape2D(Point2D rp) {
        this.refPoint = rp;
    }

    public abstract double perimeter();

    @Override
    public void translate(double dx, double dy) {
        getRefPoint().translate(dx, dy);
    }

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }
}



