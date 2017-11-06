package model.impl;

public class Cuboid extends Shape3D {
    private double length;
    private double width;
    private double height;

    public Cuboid() {
        this(new Point3D(), 10, 10, 10);
    }

    public Cuboid(Point3D rp, double length, double width, double height) {
        super(rp);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public double surface() {
        return 2 * (length * width) + 2 * (length * height) + 2 * (width * height);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape type : " + this.getClass().getName()).append(NL)
                .append(TAB).append("Length " + this.height).append(NL)
                .append(TAB).append("Width " + this.width).append(NL)
                .append(TAB).append("Height " + this.height).append(NL)
                .append(TAB).append("Volume " + volume()).append(NL)
                .append(TAB).append("Surface " + surface());
        return sb.toString();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}