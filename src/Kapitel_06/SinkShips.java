package Kapitel_06;

public class SinkShips {
    /**
     * @param args
     */
    public static void main(String[] args) {
        char[][] aPlayfield = new char[10][10];

        for (int i = 0; i < aPlayfield.length; i++) {
            for (int j = 0; j < aPlayfield[i].length; j++) {
                aPlayfield[i][j] = 'o';
                System.out.print("|" + aPlayfield[i][j]);
            }
            System.out.println("|");
        }

        aPlayfield[1][3]='x';
        aPlayfield[1][4]='x';
        aPlayfield[1][5]='x';

        aPlayfield[2][9]='x';
        aPlayfield[3][9]='x';
        aPlayfield[4][9]='x';
        aPlayfield[5][9]='x';

        aPlayfield[5][0]='x';
        aPlayfield[5][1]='x';

        aPlayfield[6][4]='x';

        System.out.println("\nSchiffe versenkt du Lappen.\n");

        for (int i = 0; i < aPlayfield.length; i++) {
            for (int j = 0; j < aPlayfield[i].length; j++) {
                System.out.print("|" + aPlayfield[i][j]);
            }
            System.out.println("|");
        }
    }
}
