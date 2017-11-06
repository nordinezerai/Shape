package model.contract;

import model.impl.Point2D;

public interface Translatable2D {
    public Point2D getRefPoint();
    public void translate(double dx, double dy);
}
