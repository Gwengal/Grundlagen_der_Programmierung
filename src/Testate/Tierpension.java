package Testate;

public class Tierpension {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        Hund oDog1 = Hund.init("Susi", "Cockerspaniel", true);
        Hund oDog2 = Hund.init("Strolch", "Mischling", true);

        // --| Start Tierpension |--
        Tierpension.printStars(47);
        System.out.println("------ Willkommen in unserer Tierpension ------");
        Tierpension.printStars(47);

        System.out.println();

        oDog1.bark(3);
        oDog1.sleep();
        System.out.println();

        oDog2.bark(10);
        System.out.println();

        oDog1.print();
        oDog2.print();
    }

    /**
     * Sterne ausgeben
     * 
     * @param iNum
     */
    private static void printStars(int iNum) {
        for (int i = 0; i < iNum; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
