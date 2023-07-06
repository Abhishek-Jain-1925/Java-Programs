package Interfaces;

import java.util.Scanner;

interface shape {
	final double pi = 3.14;

	abstract void area();
}

class circle implements shape {

	double r, A;

	circle(double r) {
		this.r = r;
	}

	public void area() {
		A = pi * r * r;
		System.out.println("Area Of Circle Is " + A);
	}
}

class sphere implements shape {
	double r, A;

	sphere(double r) {
		this.r = r;
	}

	public void area() {
		A = 4 * pi * r * r;
		System.out.println("Area Of Sphere Is " + A);
	}

}

public class Interface2 {

	public static void main(String[] args) {
		int r;
		System.out.println("Enter Value Of r");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		circle c = new circle(r);
		c.area();
		sphere s = new sphere(r);
		s.area();
	}

}
