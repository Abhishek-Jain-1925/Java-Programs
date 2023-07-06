package Interfaces;

import java.util.Scanner;

interface intoperations {
	abstract void even_odd();

	abstract void pos_neg();

	abstract void prime();

	abstract void fact();
}

class myNumber implements intoperations {
	private int n, i, f1 = 1, count = 0;;

	myNumber(int n) {
		this.n = n;
	}

	myNumber() {
		n = 0;
	}

	@Override
	public void even_odd() {
		if (n % 2 == 0) {
			System.out.println("Number Is Even");
		} else {
			System.out.println("Number Is Odd");
		}

	}

	@Override
	public void pos_neg() {
		if (n > 0)
			System.out.println("Number Is Positive");
		else if (n < 0)
			System.out.println("Number Is Nagative");
		else
			System.out.println("Number Is Zero");
	}

	@Override
	public void prime() {

		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n + " is prime number");
		} else {
			System.out.println(n + " is not prime number");
		}
	}

	@Override
	public void fact() {
		System.out.println(n + " Factor Is");
		for (i = 1; i <= n; i++) {
			f1 = f1 * i;
			System.out.println(+f1);
		}
	}

}

public class Interface1 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter The Value Of n");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		myNumber m = new myNumber(n);
		m.even_odd();
		m.pos_neg();
		m.prime();
		m.fact();
	}

}
