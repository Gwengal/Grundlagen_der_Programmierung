package Kapitel_07;

enum Character{A, B, C, D}

public class Enum_Example {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 1. Name des Enums
        // 2. Variablenname
        // 3. Enumname
        // 4. PunktOperater
        // 5. Ein Element aus dem Enum
        Character c1 = Character.D;
        System.out.println(Enum_Example.word(c1) + "\n");

        Character[] aChar = Character.values();

        for (Character eChar : aChar) {
            System.out.println(eChar.name() + ": " + Enum_Example.word(eChar));
        }
    }

    public static String word(Character c){
        // für den Rückgabewert
        String sReturn = ""; 

        switch (c) {
            case A:
                sReturn = "Alida";
                break;
            case B:
                sReturn = "Ben";
                break;
            case C:
                sReturn = "Clara";
                break;
            case D:
                sReturn = "Dennis";
                break;
        }

        return sReturn;
    }
}
