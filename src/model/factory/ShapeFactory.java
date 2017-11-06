package model.factory;

import model.contract.IShape2D;
import model.contract.IShape3D;
import model.impl.*;

public final class ShapeFactory {

    public static final ShapeFactory INSTANCE = new ShapeFactory();

    private ShapeFactory(){};

    public IShape2D createRectangle(Point2D refPoint, double length, double width){
        return new Rectangle(refPoint,length,width);
    }

    public IShape2D createSquare(Point2D refPoint, double size){
        return new Square(refPoint,size);
    }

    public IShape3D createCone(Point3D refPoint, double height, double radius){
        return new Cone(refPoint,height,radius);
    }

    public IShape3D createCuboid(Point3D refPoint, double length, double width, double height){
        return new Cuboid(refPoint,length,width,height);
    }

    public IShape3D createSphere(Point3D refPoint, double radius){
        return new Sphere(refPoint,radius);
    }
}
