package model.contract;

import model.impl.Point2D;

public interface IPoint2D extends IPoint {
    void translate(double x, double y);
    double distance(Point2D point2D);
}
