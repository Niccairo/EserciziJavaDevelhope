package com.develhope.Inheritance;

public class TestShape {
	public static void main(String[] args) {
		Shape ShapeOne = new Shape();
		Shape ShapeTwo = new Shape(3.5);
		Shape ShapeThree = new Shape(3,5.5);
		Shape ShapeFour = new Shape(5,6.5,7.3);
		Shape ShapeFive = new Shape(5,6.5,6.3,12.2);
		
		String undefinedShape = ShapeOne.getShapeDetails();
		String circle = ShapeTwo.getShapeDetails();
		String square = ShapeThree.getShapeDetails();
		String rectangle = ShapeFour.getShapeDetails();
		String triangle = ShapeFive.getShapeDetails();
		
		System.out.println(undefinedShape);
		System.out.println(circle);
		System.out.println(square);
		System.out.println(rectangle);
		System.out.println(triangle);
	}
}
