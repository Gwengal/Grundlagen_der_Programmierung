package Kapitel_07;

public class SockenWaesche {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Socke oSocki = Socke.init("rot", true);
        oSocki.waschen();
        oSocki.trocken();
        oSocki.print();
    }
}
