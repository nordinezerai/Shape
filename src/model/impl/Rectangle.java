package model.impl;

public class Rectangle extends Shape2D {
    private double length;
    private double width;

    public Rectangle() {
        this(new Point2D(), 10, 10);
    }

    public Rectangle(Point2D rp, double length, double width) {
        super(rp);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape type : " + this.getClass().getName()).append(NL)
            .append(TAB).append("Length " + this.length).append(NL)
            .append(TAB).append("Width " + this.width).append(NL)
            .append(TAB).append("Perimeter " + perimeter()).append(NL)
            .append(TAB).append("Surface " + surface());
        return sb.toString();
    }

    @Override
    public double perimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double surface() {
        return length * width;
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
}