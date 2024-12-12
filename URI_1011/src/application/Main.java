package application;

import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static Double pi = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		int raio = sc.nextInt();
		double volume = (4.0 / 3) * pi * raio * raio * raio;
		
		System.out.printf("VOLUME = %.3f\n", volume);
				
		sc.close();
	}
}