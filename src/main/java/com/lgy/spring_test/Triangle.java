package com.lgy.spring_test;

public class Triangle {
	int x,y,z;
	
	public void tira() {
		if (x+y<=z || x+z<=y || y+z<=x) {
			System.out.println("삼각형 ㅂㄱㄴ");
		} else {
			System.out.println("삼각형 ㄱㄴ");
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	
}
