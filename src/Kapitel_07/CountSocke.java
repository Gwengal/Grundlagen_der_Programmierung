package Kapitel_07;

public class CountSocke {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Socke[] oSocks = new Socke[3];

        oSocks[0] = Socke.init("blau");
        oSocks[1] = Socke.init("grün");
        oSocks[2] = Socke.init("rot");

        System.out.println("Anzahl Socken: " + Socke.iAnzahl); 
    }
}
