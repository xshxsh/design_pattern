package com.example.designpattern.structure.decorator;

public class Main {
   public static void main(String[] args) {
 
      Shape circle = new Circle();
      ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
      ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
      circle.draw();
      redCircle.draw();
      redRectangle.draw();
   }
}