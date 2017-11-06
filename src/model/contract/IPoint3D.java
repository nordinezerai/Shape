package model.contract;

import model.impl.Point3D;

public interface IPoint3D extends IPoint2D {
    void translate(double x, double y, double z);
    double distance(Point3D point3D);
}
