package Kapitel_08;

public class MaxTest {
    public static void main(String[] args) {
        KFZ[] aKfz = new KFZ[5];
        aKfz[0] = new KFZ("HO-X1", 1);
        aKfz[1] = new KFZ("HO-X2", 2);
        aKfz[2] = new KFZ("HO-X3", 5);
        aKfz[3] = new KFZ("HO-X4", 3);
        aKfz[4] = new KFZ("HO-X5", 1);

        System.out.printf("Größtes KFZ: %s\n", aKfz[Max.getMax(aKfz)]);
    }
}
