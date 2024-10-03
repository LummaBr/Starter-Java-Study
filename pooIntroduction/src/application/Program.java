package application;

import java.util.Scanner;
import entities.triangle;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		triangle x, y;
		y = new triangle();
		x = new triangle();
		
		System.out.println("Enter dimensions of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter dimensions of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
	
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("Area of X: %.4f %n", areax);
		System.out.printf("Area of Y: %.4f %n", areay);
		
		if (areax > areay) {
			System.out.println("Large area: X");
		} else {
			System.out.println("Large area: Y");
		}
		
		sc.close();
	}

}
