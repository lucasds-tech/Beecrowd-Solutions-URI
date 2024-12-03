package application;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int prod = x * y;
    	
    	System.out.println("PROD = " + prod);
        
        sc.close();
    }
 
}