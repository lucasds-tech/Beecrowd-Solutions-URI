/* Leia os quatro valores correspondentes aos eixos x e y de 
 * dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule 
 * a distância entre eles, mostrando 4 casas decimais.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Locale.setDefault(Locale.US);
        
    	double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
       
        double calc = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        
        System.out.printf("%.4f\n", calc); 
        
        sc.close();
    }
	
}

