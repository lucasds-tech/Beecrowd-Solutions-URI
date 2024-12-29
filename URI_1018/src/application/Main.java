/*
 * Leia um valor inteiro. A seguir, calcule o menor número de 
 * notas possíveis (cédulas) no qual o valor pode ser decomposto.
 * As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
 * A seguir mostre o valor lido e a relação de notas necessárias.
 */

package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int notasInseridas = sc.nextInt();
        int att = notasInseridas;
        
        int notas100 = att / 100;
        att -= notas100 * 100;
        int notas50 = att / 50;
        att -= notas50 * 50;
        int notas20 = att / 20;
        att -= notas20 * 20;
        int notas10 = att / 10;
        att -= notas10 * 10;
        int notas5 = att / 5;
        att -= notas5 * 5;
        int notas2 = att / 2;
        att -= notas2 * 2;
        int notas1 = att;
        
        System.out.println(notasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
        
        sc.close();
	}

}
