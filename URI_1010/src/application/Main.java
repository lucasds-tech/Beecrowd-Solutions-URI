/* Neste problema, deve-se ler o código de uma peça 1, 
 * o número de peças 1, o valor unitário de cada peça 1,
 * o código de uma peça 2, o número de peças 2 e o valor 
 * unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double total = (num1 * valor1) + (num2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
				
		sc.close();
	}
}