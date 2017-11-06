package model.contract;

import model.impl.Point3D;

public interface Translatable3D extends Translatable2D {
    public Point3D getRefPoint();
    public void translate(double dx, double dy, double dz);
}
