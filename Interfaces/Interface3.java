package Interfaces;

import java.util.Scanner;

interface Operation {
	final double pi = 3.14;

	abstract void area();

	abstract void volume();
}

class cylinder implements Operation {
	double radius, height, A, V;

	cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public void area() {
		A = (2 * pi * radius * height) + (2 * pi * radius * radius);
		System.out.println("Area Of Cylinder Is " + A);
	}

	@Override
	public void volume() {

		V = pi * radius * radius * height;
		System.out.println("Volume Of Cylinder Is " + V);
	}

}

public class Interface3 {

	public static void main(String[] args) {
		double radius, height;
		System.out.println("Enter The Value Of radius and height");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		height = sc.nextDouble();
		cylinder c = new cylinder(radius, height);
		c.area();
		c.volume();

	}

}
