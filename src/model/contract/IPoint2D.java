package model.contract;

import model.impl.Point2D;

public interface IPoint2D extends IPoint {
    void translate(double dx, double dy);
    double distance(Point2D point2D);
}
