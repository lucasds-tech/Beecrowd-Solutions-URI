/*
Joaozinho quer calcular e mostrar a quantidade de litros de combustível 
gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. Para isso, 
ele gostaria que você o auxiliasse através de um simples programa. Para 
efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e 
a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância 
percorrida e, em seguida, calcular quantos litros seriam necessários. 
Mostre o valor com 3 casas decimais após o ponto.
*/

package application;


import java.io.IOException;
import java.util.Scanner;

public class Main {
	
   public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       
       int tempo = sc.nextInt();
       int velocidade = sc.nextInt();
       
       double kilometros = tempo * velocidade;
       double media = kilometros / 12;
      
       System.out.println(String.format("%.3f", media)); 
       
       sc.close();
   }
	
}
