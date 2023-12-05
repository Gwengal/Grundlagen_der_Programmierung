package Kapitel_07;

public class SockenWaesche {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Socke oSocki = Socke.init("rot", true);
        Socke oGreenSock = Socke.init("grün");
        oSocki.waschen();
        oSocki.trocken();
        oSocki.print();
        oGreenSock.print();
    }
}
