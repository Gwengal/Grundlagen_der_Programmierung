package ProbeKlausur;

public class TestAnweisungen { 
    public static void main(String[] args) {
        System.out.println(check10(1, 10));
        System.out.println(check10(9, 1));
        System.out.println(check10(9, 2));

        System.out.println(max(7, 9));
        System.out.println(max(-1, -5));
        System.out.println(max(4, 4));

        System.out.println(auspennen(true, true));
        System.out.println(auspennen(false, false));
        System.out.println(auspennen(true, false));

        System.out.println(sortiert(1,5,7));
        System.out.println(sortiert(4,4,4));
        System.out.println(sortiert(2,1,7));

        System.out.println(count5iter(123545));
        System.out.println(count5rec(123545));

        System.out.println(count5iter(555));
        System.out.println(count5rec(555));

        System.out.println(count5iter(23488));
        System.out.println(count5rec(23488));

        
    }

    public static boolean check10(int a, int b){
        return ((a==10 || b==10) || (a+b) == 10);
    }

    public static int max(int a, int b){
        return (a>=b?a:b);
    }

    public static boolean auspennen(boolean werktag, boolean ferien){
        return (((ferien == true) || werktag == false) ? true : false);
    }

    public static boolean sortiert(int a, int b, int c){
        return a<=b && b <=c;
    }

    public static int count5iter(int zahl){
        int iCount = 0;
        while (zahl > 0) {
            iCount = (((zahl % 10) == 5) ? (iCount+1) : iCount);
            zahl /= 10;
        }

        return iCount;
    }
    public static int count5rec(int zahl){
        if (zahl == 0) {
            return 0;
        }

        return (zahl % 10 == 5 ? 1 : 0) + count5iter(zahl/10);
    }
}
