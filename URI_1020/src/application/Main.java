/*
 * Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a 
 * em anos, meses e dias Obs.: apenas para facilitar o c�lculo, considere todo ano 
 * com 365 dias e todo m�s com 30 dias. Nos casos de teste nunca haver� uma situa��o 
 * que permite 12 meses e alguns dias, como 360, 363 ou 364. Este � apenas um exerc�cio 
 * com objetivo de testar racioc�nio matem�tico simples.

 */

package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int yday = sc.nextInt();
		
		int anos = yday / 365;
		yday -= anos * 365;
		int mes = yday / 30;
		yday -= mes * 30;
		int dias = yday;
		
		System.out.println(anos +" ano(s)");
		System.out.println(mes +" mes(es)");
		System.out.println(dias +" dia(s)");
		
		sc.close();
	}
}