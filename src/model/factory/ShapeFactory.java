package model.factory;

import model.contract.IShape2D;
import model.impl.Rectangle;

public final class ShapeFactory {

    public static final ShapeFactory INSTANCE = new ShapeFactory();

    private ShapeFactory(){};

    public IShape2D createRectangle(double length, double width){
        return new Rectangle(length,width);
    }
}
