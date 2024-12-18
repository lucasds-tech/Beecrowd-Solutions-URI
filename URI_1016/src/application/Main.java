package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
    	Scanner sc = new Scanner(System.in);
    	Locale.setDefault(Locale.US);
        
    	int km = sc.nextInt();
        int minutos = (60 * km) / 30;
       
        System.out.println(minutos + " minutos"); 
        
        sc.close();
    }
}

