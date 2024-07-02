package com.designpattern;

public class FactoryPattern {
    //creational design pattern
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        Shape triangle = shapeFactory.getShape("Triangle");
        triangle.draw();
    }
}
interface Shape{
    void draw();
}
class Cirle implements Shape{
    @Override
    public void draw() {
     System.out.println("Circle Draw");
    }
}
class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Triangle Draw");
    }
}
class ShapeFactory{
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Cirle();
        }else {
            return null;
        }
    }
}