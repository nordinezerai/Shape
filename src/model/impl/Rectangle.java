package model.impl;

public class Rectangle extends Shape2D {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter(){
        return 2 * (this.length + this.width);
    }
    @Override
    public double surface() {
        return 0;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Shape type : " + this.getClass().getName()).append(NL)
                .append(TAB).append("Length " + this.length).append(NL)
                .append(TAB).append("Width " + this.width).append(NL)
                .append(TAB).append("Perimeter " + perimeter()).append(NL)
                .append(TAB).append("Surface " + surface());
        return sb.toString();
    }

}
