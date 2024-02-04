package Uebungen.Uebung_10;

import Kapitel_07.Buch;
import Kapitel_07.Stack;

public class StackTest2 {
    public static void main(String[] args) {
        Stack oStack = new Stack(5);

        try {
            oStack.pop().print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            oStack.push(Buch.init("Tolkin", "Das Silmarilion"));
            oStack.push(Buch.init("Tolkin", "Herr der Ringe die Gefährten"));
            oStack.push(Buch.init("Tolkin", "Irgendwas 1"));
            oStack.push(Buch.init("Tolkin", "Irgendwas 2"));
            oStack.push(Buch.init("Tolkin", "Irgendwas 3"));
            oStack.push(Buch.init("Tolkin", "Irgendwas 4"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            oStack.pop().print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
