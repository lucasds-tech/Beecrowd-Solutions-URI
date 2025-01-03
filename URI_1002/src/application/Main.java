/* A fórmula para calcular a área de uma circunferência é:
 area = π . raio2. Considerando para este problema que π = 3.14159:
 Efetue o cálculo da área, elevando o valor de raio ao quadrado
 e multiplicando por π.
 */

package application;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	double raio = sc.nextDouble();
        double n = 3.14159;
         
        double area = n * (raio * raio);
        
        System.out.println(String.format("A=%.4f", area));
        
        sc.close();
    }
 
}