// Write a java program to accept a number from the user, if number is less than zero then throw 
// user defined Exception “Number is 0” otherwise calculate the sum of first and last digit of a given number
package Exception_Programs;

import java.util.Scanner;

class ZeroException extends Exception {

	@Override
	public String toString() {
		return "No is less than zero or equal to zero";

	}

}

public class UserDefine {

	public static void main(String[] args) {
		int n, first = 0, last, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		try {
			if (n <= 0) {
				throw new ZeroException();
			} else {
				last = n % 10;
				while (n > 0) {
					first = n;
					n = n / 10;

				}
				sum = first + last;
				System.out.println("Sum=" + sum);
			}
		} catch (ZeroException e) {
			System.out.println(e);
		}

	}

}
