package model.impl;

import model.contract.IShape3D;
import model.contract.Translatable3D;

public abstract class Shape3D extends Shape implements IShape3D, Translatable3D {
    public Point3D refPoint;

    public Shape3D(Point3D rp) {
        refPoint = rp;
    }

    public abstract double volume();

    @Override
    public Point3D getRefPoint() {
        return refPoint;
    }

    @Override
    public void translate(double dx, double dy) {
        getRefPoint().translate(dx, dy);
    }

    @Override
    public void translate(double dx, double dy, double dz) {
        getRefPoint().translate(dx, dy, dz);
    }
}

