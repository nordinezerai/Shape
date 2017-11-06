package model.impl;

import model.contract.IShape3D;
import model.contract.Translatable3D;

public abstract class Shape3D extends Shape implements IShape3D, Translatable3D {
    public Point3D refPoint;

    public Shape3D(Point3D point3D) {
        refPoint = point3D;
    }

    public abstract double volume();

    @Override
    public Point3D getRefPoint() {
        return refPoint;
    }


    @Override
    public void translate(double x, double y) {
        getRefPoint().translate(x, y);
    }

    @Override
    public void translate(double x, double y, double z) {
        getRefPoint().translate(x, y, z);
    }
}

