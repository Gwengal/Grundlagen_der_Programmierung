package Uebungen.Uebung_4;

public class Quersumme {
    public static void main(String[] args) {
        System.out.println(Quersumme.querumme(1199));
    }

    private static int querumme(int i){
        if (i == 0) {
            return 0;
        }

        return (i % 10) + Quersumme.querumme(i / 10);
    }
}
