package Uebungen.Uebung_2;

import java.util.Scanner;

public class Eingabe {
    public static void main (String[] args)    {  
        int a, b, c;  
        Scanner read = new Scanner(System.in);  

        System.out.print("Bitte geben Sie drei ganze Zahlen "); 
        System.out.println("aufsteigend sortiert ein.");  
        System.out.println("Also z.B. 1, 2, 5 oder 4, 4, 6!");   
        
        System.out.println("Erste Zahl: ");  
        a = read.nextInt();  
        System.out.println("Zweite Zahl: ");  
        b = read.nextInt();  
        System.out.println("Dritte Zahl: ");  
        c = read.nextInt();     
        read.close();
        
        if (a > b || b > c)  {   
            System.out.println("Das ist nicht aufsteigend sortiert!");  
        }  
        System.out.println("Ihre Eingabe: " + a + " " + b + " " + c);    
        // Hier geht das Programm irgendwie weiter, aber das           
        // interessiert uns an dieser Stelle nicht.    
    }
}
