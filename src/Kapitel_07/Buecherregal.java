package Kapitel_07;

public class Buecherregal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Buch[] aBooks = new Buch[4];

        aBooks[0] = Buch.init("Tolkin", "Herr der Ringe die Gefährten");
        aBooks[1] = Buch.init("Tolkin", "Herr der Ringe die zwei Türme");
        aBooks[2] = Buch.init("Tolkin", "Der Untergang von Numenor");
        aBooks[3] = Buch.init("Tolkin", "Das Silmarilion");

        System.out.println("Meine Bücherliste: ");
        for (Buch oBook : aBooks) {
            if (oBook != null)
                oBook.print();
        }
    }
}
