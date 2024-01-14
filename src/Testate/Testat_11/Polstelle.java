package Testate.Testat_11;

public class Polstelle {
    public static void main(String[] args) {
        Polstelle.calculate(-10, 10);
    }

    public static void calculate(int iMin, int iMax) {
        double dCalc,
               dNenner;

        for (int i = iMin; i <= iMax; i++) {
            try {
                System.out.printf("%d \t", i);

                dNenner = Math.pow(i, 3) - ( 5 * Math.pow(i, 2) ) - i + 5;
                if (dNenner == 0) {
                    throw new Exception("Polstelle");
                }

                dCalc = 1.0 / dNenner;
                System.out.printf("%f\n", dCalc);                
            } catch (Exception e) {
                System.out.printf("%s\n", e.getMessage());
            }
        }
    }
}
