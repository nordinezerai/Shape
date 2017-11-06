package model.impl;

import model.contract.IPoint2D;

public class Point2D implements IPoint2D {
    private double x;
    private double y;

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void translate(double dx, double dy) {
        x = getX() + dx;
        y = getY() + dy;
    }

    public boolean isOrigin() {
        return ((getX() == 0) && (getY() == 0));
    }

    public double distance(Point2D other) {
        return Math.sqrt(Math.pow(getX() - other.getX(), 2) + Math.pow(getY() - other.getY(), 2));
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

}

