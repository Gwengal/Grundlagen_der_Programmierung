package Uebungen.Uebung_8;

public class TestBruch {
    public static void main(String[] args) {
        Bruch oB1 = Bruch.init(4, -12);
        Bruch oB2 = Bruch.init(-100, 500);

        System.out.printf("%s + %s = %s\n", oB1, oB2, Bruch.add(oB1, oB2));
        System.out.printf("%s - %s = %s\n", oB1, oB2, Bruch.sub(oB1, oB2));
        System.out.printf("%s * %s = %s\n", oB1, oB2, Bruch.mult(oB1, oB2));
        System.out.printf("%s / %s = %s\n", oB1, oB2, Bruch.div(oB1, oB2));

    }
}
