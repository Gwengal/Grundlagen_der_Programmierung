package Kapitel_08;

public class Kugelsortieren {
    public static void main(String[] args) {
        Kugel[] aKiste = new Kugel[10];
        aKiste[0] = new Kugel(10, "Grün");
        aKiste[1] = new Kugel(9, "Blau");
        aKiste[2] = new Kugel(8, "Rot");
        aKiste[3] = new Kugel(7, "Violet");
        aKiste[4] = new Kugel(6, "Lila");
        aKiste[5] = new Kugel(5, "Pink");
        aKiste[6] = new Kugel(4, "Orange");
        aKiste[7] = new Kugel(5, "Grün");
        aKiste[8] = new Kugel(6, "Gelb");
        aKiste[9] = new Kugel(8, "Magenta");
        
        BubbleSort.sort(aKiste);

        for (Kugel okugel : aKiste) {
            System.out.println(okugel);
        }
    }
}
