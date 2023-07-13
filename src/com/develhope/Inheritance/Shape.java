package com.develhope.Inheritance;

public class Shape {
	private String shapeName;
	private Double numberOfEdges;

	public Shape() {
		System.out.println("Shape object created");
		this.shapeName = "Undefined Shape";
	}
	public Shape(Double radius) {
		System.out.println("Circle created");
		this.shapeName = "Circle";
	}
	public Shape(int edges, Double edgeLenght) {
		System.out.println("Square created");
		this.numberOfEdges = (double)edges;
		this.shapeName = "Square";
	}
	public Shape(int edges,Double e1,Double e2) {
		System.out.println("Rectangle Created");
		this.numberOfEdges = (double)edges;
		this.shapeName = "Rectangle";
	}
	public Shape(int edges,Double e1,Double e2,Double e3) {
		System.out.println("Triangle Created");
		this.numberOfEdges = (double)edges;
		this.shapeName = "Triangle";
	}
	public String getShapeDetails() {
		return "The shape is a " + this.shapeName + " and the number of edges is " + this.numberOfEdges; 
	}
}
