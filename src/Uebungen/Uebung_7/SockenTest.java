package Uebungen.Uebung_7;

import Kapitel_07.Socke;

public class SockenTest {
    public static void main(String[] args) {
        Socke socke1 = Socke.init("weiss", true);  
        Socke socke2 = Socke.init("rot", true); 
        Socke socke3 = socke2;  
        Socke socke4 = socke1;  
        Socke socke5 = Socke.init("gelb", true); 
        socke3.setFarbe("gelb");  
        socke2.setFarbe("schwarz" + socke1.getFarbe());  
        socke1 = socke5;  
        socke5 = socke4;
        
        // Gelb  
        System.out.println("Socke 1: " + socke1.getFarbe());  
        // Schwarzweiß
        System.out.println("Socke 2: " + socke2.getFarbe());  
        // Schwarzweiß
        System.out.println("Socke 3: " + socke3.getFarbe());  
        // Weiß
        System.out.println("Socke 4: " + socke4.getFarbe());
        // Weiß  
        System.out.println("Socke 5: " + socke5.getFarbe());
    }
}
