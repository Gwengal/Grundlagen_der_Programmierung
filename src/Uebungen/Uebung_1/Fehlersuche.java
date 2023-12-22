package Uebungen.Uebung_1;

import java.util.Scanner;

public class Fehlersuche {
    public static void main (String[] args)  {   
        int a, b, c;      
        Scanner read = new Scanner(System.in);      
        
        System.out.println("Bitte eine ganze Zahl eingeben: ");        
        a = read.nextInt();       
        System.out.println("Bitte eine weitere Zahl eingeben: ");        
        //! Semikolen fehlte
        b = read.nextInt();        
        System.out.println("Bitte eine weitere Zahl eingeben: ");        
        c = read.nextInt();               
        
        //! Variable Summe existiert nicht
        int sum = a+b+c;         
        
        System.out.println("******************");   
        //! Zeichenverkettungsoperator fehlt vor "sum"
        System.out.println(a + "+" + b + "+" + c + "=" + sum);      
        //! Zeichenkette mit den "*" muss in Anführungszeichen gesetzt werden
        System.out.println("********************");    
        
        read.close();
    }
}
