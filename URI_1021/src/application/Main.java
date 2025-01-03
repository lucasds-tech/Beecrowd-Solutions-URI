package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		int sep;
		
		System.out.println("NOTAS:");
		sep = (int) n / 100;
		System.out.println(sep + " nota(s) de R$ 100.00");
		n = n % 100;
		sep = (int) n / 50;
		System.out.println(sep + " nota(s) de R$ 50.00");
		n = n % 50;
		sep = (int) n / 20;
		System.out.println(sep + " nota(s) de R$ 20.00");
		n = n % 20;
		sep = (int) n / 10;
		System.out.println(sep + " nota(s) de R$ 10.00");
		n = n % 10;
		sep = (int) n / 5;
		System.out.println(sep + " nota(s) de R$ 5.00");
		n = n % 5;
		sep = (int) n / 2;
		System.out.println(sep + " nota(s) de R$ 2.00");
		n = n % 2;
		
		n = n * 100;
		
		System.out.println("MOEDAS:");
		sep = (int) n / 100;
		System.out.println(sep + " moeda(s) de R$ 1.00");
		n = n % 100;
		sep = (int) n / 50;
		System.out.println(sep + " moeda(s) de R$ 0.50");
		n = n % 50;
		sep = (int) n / 25;
		System.out.println(sep + " moeda(s) de R$ 0.25");
		n = n % 25;
		sep = (int) n / 10;
		System.out.println(sep + " moeda(s) de R$ 0.10");
		n = n % 10;
		sep = (int) n / 5;
		System.out.println(sep + " moeda(s) de R$ 0.05");
		n = n % 5;
		sep = (int) n / 1;
		System.out.println(sep + " moeda(s) de R$ 0.01");		
		
		sc.close();
	}
}
