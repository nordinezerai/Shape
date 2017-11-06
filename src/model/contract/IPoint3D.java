package model.contract;

public interface IPoint3D extends IPoint2D {
    void translate(double x,double y,double z);
    double distance();
}
