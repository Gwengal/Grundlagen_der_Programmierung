package Uebungen.Uebung_9;

public class ParkhausSimulation {
    public static void main(String[] args) {
        Parkhaus oParkhaus = new Parkhaus(5);
        System.out.printf("Freie Plätze im Parkhaus: %d\n", oParkhaus.emptySpaces());
        oParkhaus.einfahren(new Auto("SEL IK 271"));
        oParkhaus.einfahren(new Auto("SEL IK 272"));
        oParkhaus.einfahren(new Auto("SEL IK 273"));
        oParkhaus.einfahren(new Auto("SEL IK 274"));
        oParkhaus.einfahren(new Auto("SEL IK 275"));
        oParkhaus.einfahren(new Auto("SEL IK 276"));

        oParkhaus.print();
    }
}
