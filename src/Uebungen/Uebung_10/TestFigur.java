package Uebungen.Uebung_10;

public class TestFigur {
    public static void main(String[] args) {
        Figur[] oFigurs = new Figur[3];
        oFigurs[0] = new Kreis("Rot", 4.4);
        oFigurs[1] = new Rechteck("Grün", 2.2, 3.3);
        oFigurs[2] = new Quadrat("Gelb", 4.0);

        for(Figur oFigur : oFigurs){
            oFigur.print();
        }
    }
}
