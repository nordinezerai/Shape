package main;

import model.contract.IShape2D;
import model.factory.ShapeFactory;
import model.impl.Point2D;

public final class Main {
    public static void main(String[] args){
        IShape2D rec1 = ShapeFactory.INSTANCE.createRectangle(new Point2D(),3.5d,2.3d);
        System.out.println(rec1);
    }
}
