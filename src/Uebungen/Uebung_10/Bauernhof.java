package Uebungen.Uebung_10;

public class Bauernhof {
    public static void main(String[] args) {
        Tier kater = new Katze("Felix");
        Tier katze = new Katze("Molly");
        Tier wachhung = new Hund("Bello");
        kater.verstaendigen();
        katze.verstaendigen();
        wachhung.verstaendigen();
    }
}
