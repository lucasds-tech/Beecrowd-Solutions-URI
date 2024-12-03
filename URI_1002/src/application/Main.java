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