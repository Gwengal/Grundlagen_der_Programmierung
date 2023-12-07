package Kapitel_07;

import java.time.LocalDate;

public class Hochschule {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Student oStudi1 = new Student("Alexander", 123, LocalDate.of(2000, 02, 22), "Wirtschaftsinformatik", 1);
        Student oStudi2 = new Student("Max", 456, LocalDate.of(2001, 01, 01), "BWL", 3);

        System.out.println(oStudi1.getInfo());
        oStudi1.newSem(true);
        System.out.println(oStudi1.getInfo());

        System.out.println(oStudi2.getInfo());
        oStudi2.change("Wirtschaftsinformatik");
        System.out.println(oStudi2.getInfo());
    }
}
