/* Calcule o consumo médio de um automóvel sendo fornecidos 
 * a distância total percorrida (em Km) e o total de combustível gasto (em litros).
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();

		double consumo = x / y;
		
		System.out.println(String.format("%.3f km/l", consumo));   
	
		sc.close();
	}

}
