package Kapitel_07;

public class CountSocke {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Socke[] oSocks = new Socke[3];

        oSocks[0] = Socke.init("gelb", Typ.LINKS);
        oSocks[1] = Socke.init("grün", Typ.LINKS);
        oSocks[2] = Socke.init("rot", Typ.LINKS);

        System.out.println("Anzahl Socken: " + Socke.getAnzahl()); 
    }
}
