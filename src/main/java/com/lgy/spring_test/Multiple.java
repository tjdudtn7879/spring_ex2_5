package com.lgy.spring_test;

public class Multiple {
	int x;
	
	public void mult() {
		boolean multiple=false;
		if (x%3==0) {
			System.out.println("3의 배수이다.");
			multiple=true;
		}
		if (x%5==0) {
			System.out.println("5의 배수이다.");
			multiple=true;
		}
		if (x%8==0) {
			System.out.println("8의 배수이다.");
			multiple=true;
		}
		if (!multiple) {
			System.out.println("어느 배수도 아니다.");
			multiple=true;
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
