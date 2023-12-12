package Testate;

public class Hafen {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        Faehre oFerry = new Faehre(5);

        // --| Autos in die Fähre einfahren lassen |--
        System.out.println("Die Autos fahren ein:   ");
        oFerry.push(new Auto("HO S 3177", 2000));
        oFerry.push(new Auto("HO X 111", 1500));
        oFerry.push(new Auto("BT KK 123", 1800));
        oFerry.push(new Auto("HO AA 123", 2000));
        oFerry.push(new Auto("KU X 99", 1500));
        oFerry.push(new Auto("SEL IK 277", 1700));

        // --| Ausgabe der Autos auf der Fähre |--
        oFerry.outputCars();
        
        // --| Ausgabe des aktuellen Gewichts |--
        oFerry.outputSumWeight();

        // --| Autos von der Fähre ausfahren |--
        oFerry.pop();
        oFerry.pop();
        oFerry.pop();
        oFerry.pop();
        oFerry.pop();
        oFerry.pop();
    }
}
