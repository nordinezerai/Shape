package model.impl;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere() {
        this(new Point3D(), 10);
    }

    public Sphere(Point3D rp, double radius) {
        super(rp);
        this.radius = radius;
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surface() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape type : " + this.getClass().getName()).append(NL)
                .append(TAB).append("Radius " + this.radius).append(NL)
                .append(TAB).append("Volume " + volume()).append(NL)
                .append(TAB).append("Surface " + surface());
        return sb.toString();
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
