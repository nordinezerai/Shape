package main;

import model.contract.IShape2D;
import model.contract.IShape3D;
import model.factory.ShapeFactory;
import model.impl.Point2D;
import model.impl.Point3D;

public final class Main {
    public static void main(String[] args){
        IShape2D rec1 = ShapeFactory.INSTANCE.createRectangle(new Point2D(2,2),3.5d,2.3d);
        System.out.println(rec1);
        IShape2D car1 = ShapeFactory.INSTANCE.createSquare(new Point2D(2,2),5);
        System.out.println(car1);
        IShape3D con1 = ShapeFactory.INSTANCE.createCone(new Point3D(2,2,2),5.0d,0.6d);
        System.out.println(con1);
        IShape3D cub1 = ShapeFactory.INSTANCE.createCuboid(new Point3D(2,2,2),5.0d,6.0d, 5.0d);
        System.out.println(con1);
        IShape3D sph1 = ShapeFactory.INSTANCE.createSphere(new Point3D(2,2,2),5.0d);
        System.out.println(con1);
    }
}
