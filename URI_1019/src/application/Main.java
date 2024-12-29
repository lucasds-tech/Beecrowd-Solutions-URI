/*
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado 
 * evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
 */

package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int duracSeg = sc.nextInt();
		
		int horas = duracSeg / 3600;
		duracSeg -= horas * 3600;
		int min = duracSeg / 60;
		duracSeg -= min * 60;
		int seg = duracSeg;
		
		System.out.println(horas + ":" + min + ":" + seg);
		
		sc.close();
	}
}
