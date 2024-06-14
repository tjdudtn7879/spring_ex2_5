package com.lgy.spring_test;

public class MultipleTriangle {
	public static void main(String[] args) {
		Multiple mult=new Multiple();
		Triangle tria=new Triangle();
		
		mult.setX(240);
		tria.setX(4);
		tria.setY(3);
		tria.setZ(5);
		
		mult.mult();
		tria.tira();
	}
}
