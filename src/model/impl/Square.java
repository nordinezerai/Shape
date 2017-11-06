package model.impl;

public class Square extends Rectangle {
    public Square() {
        this(new Point2D(), 10);
    }

    public Square(Point2D rp, double size) {
        super(rp, size, size);
    }

    public double getSize() {

        return this.getWidth();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shape type : " + this.getClass().getName()).append(NL)
                .append(TAB).append("Length " + getLength()).append(NL)
                .append(TAB).append("Width " + getWidth()).append(NL)
                .append(TAB).append("Perimeter " + perimeter()).append(NL)
                .append(TAB).append("Surface " + surface());
        return sb.toString();
    }
}

