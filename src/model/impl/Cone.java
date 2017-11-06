package model.impl;

public class Cone extends Shape3D {
    private double height;
    private double radius;

    public Cone() {
        this(new Point3D(), 10, 10);
    }

    public Cone(Point3D rp, double height, double radius) {
        super(rp);
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (1 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surface() {
        double a = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + a);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape type : " + this.getClass().getName()).append(NL)
                .append(TAB).append("Height " + this.height).append(NL)
                .append(TAB).append("Radius " + this.radius).append(NL)
                .append(TAB).append("Volume " + volume()).append(NL)
                .append(TAB).append("Surface " + surface());
        return sb.toString();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
