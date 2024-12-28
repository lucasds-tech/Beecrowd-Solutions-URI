/* Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
 * Efetue a soma de A e B atribuindo o seu resultado na variável X. 
 * Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem 
 * alguma além daquilo que está sendo especificado e não esqueça de imprimir
o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".*/

package application;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        int A;
        int B;
        
        Scanner sc = new Scanner(System.in);
        
        A = sc.nextInt();
        B = sc.nextInt();
        
        System.out.println("X = " + (A + B));
        
        sc.close();
    }
 
}