package Uebungen.Uebung_6;

public class Teilbarkeit11 {
    public static void main(String[] args) {
        System.out.printf("%d teilbar durch 11: %s \n", 121, Teilbarkeit11.div11(121));
        System.out.printf("%d teilbar durch 11: %s \n", 104654, Teilbarkeit11.div11(104654));
        System.out.printf("%d teilbar durch 11: %s \n", 45749, Teilbarkeit11.div11(45749));
        System.out.printf("%d teilbar durch 11: %s \n", 122, Teilbarkeit11.div11(122));
    }

    private static boolean div11(long n){
        String sNumb = Long.toString(n);
        int iOdd = 0, iEven = 0, iLength = sNumb.length();
        
        for (int i = 1; i <= iLength; i++) {
            if (i % 2 != 0) {
                iOdd += Character.getNumericValue(sNumb.charAt(0));                
            }else{
                iEven += Character.getNumericValue(sNumb.charAt(0));
            }

            sNumb = sNumb.substring(1);
        }

        if ((iOdd - iEven) % 11 == 0) {
            return true;
        }

        return false;
    }
}
