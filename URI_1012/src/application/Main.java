package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double tri, cir, trap, qua, ret;
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		tri = a * c / 2.0;
		cir = (c * c) * 3.14159;
		trap = ((a + b) * c) / 2.0;
		qua = b * b;
		ret = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", tri );
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", trap);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);
		
		sc.close();
	}
}