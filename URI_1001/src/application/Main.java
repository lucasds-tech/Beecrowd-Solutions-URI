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