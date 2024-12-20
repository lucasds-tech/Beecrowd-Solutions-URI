/* Leia dois valores inteiros, no caso para variáveis A e B. 
 * A seguir, calcule a soma entre elas e atribua à variável SOMA. 
 * A seguir escrever o valor desta variável.*/

package application;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;
        
        System.out.println("SOMA = " + soma);
        
        sc.close();
    }
	
}