package model.impl;

import model.contract.IPoint3D;

public class Point3D extends Point2D implements IPoint3D {
    private double z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(double x, double y, double z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public void translate(double x, double y, double z) {
        super.translate(x, y);
        this.z += z;
    }

    @Override
    public boolean isOrigin() {
        return (super.isOrigin() && (z == 0));
    }

    public double distance(Point3D point3D) {
        return Math.sqrt(Math.pow(getX() - point3D.getX(), 2)
                + Math.pow(getY() - point3D.getY(), 2)
                + Math.pow((getZ() - point3D.getZ()), 2));
    }

    @Override
    public String toString() {
        return "( x : "+getX()+", y : "+getY()+", z : "+getZ()+")";
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}

