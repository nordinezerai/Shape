package model.factory;

import model.contract.IShape2D;
import model.impl.Point2D;
import model.impl.Rectangle;

public final class ShapeFactory {

    public static final ShapeFactory INSTANCE = new ShapeFactory();

    private ShapeFactory(){};

    public IShape2D createRectangle(Point2D refPoint, double length, double width){
        return new Rectangle(refPoint,length,width);
    }
}
