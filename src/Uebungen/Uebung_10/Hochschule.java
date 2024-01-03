package Uebungen.Uebung_10;

public class Hochschule {
    public static void main(String[] args) {
        Mensch oMensch;
        
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                oMensch = new Student("Mathe");
            }else{
                oMensch = new Professor("Mathe");
            }

            System.out.println(oMensch);
        }
    }
}
