/* Escreva um programa que leia o número de um funcionário, 
 * seu número de horas trabalhadas, o valor que recebe por hora 
 * e calcula o salário desse funcionário. A seguir, mostre o número
 *  e o salário do funcionário, com duas casas decimais.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int hrs = sc.nextInt();
		double salario = sc.nextDouble();
		
		double soma = hrs * salario;
		
		System.out.println("NUMBER = "+ num);
		System.out.printf("SALARY = U$ %.2f\n", soma);
		
		sc.close();
	}
}