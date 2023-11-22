package Testate;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static char _scPlayfield = '-';

    /**
     * @param args
     */
    public static void main(String[] args) {
        // --| Deklaration |--
        int iStars = 20;
        char[][] aPlayfield = new char[3][3];
        String sInput;
        Scanner oScanner = new Scanner(System.in);
        Random oRandom = new Random();

        // Start-Meldung ausgeben
        TicTacToe.outputStardEnd(iStars, "Start");

        // --| TicTacToe ausführen |--
        while (true) {
            // --| TicTacToe starten |--
            TicTacToe.startGame(aPlayfield, oScanner, oRandom);

            // Abfragen ob der User noch eine Runde spielen möchte
            System.out.print("\nWollen Sie noch eine Runde spielen [y/Y]?");
            sInput = oScanner.nextLine();

            // User möchte noch eine Runde spielen.
            // Neues Spiel starten
            if (sInput.contains("y") || sInput.contains("Y")) {
                System.out.print("\n\n\n\n\n");
                continue;
            }

            // Schleife verlassen und Logik beenden
            break;
        }

        // End-Meldung ausgeben
        TicTacToe.outputStardEnd(iStars, "Ende");
        oScanner.close();
    }

    /**
     * Start/End Meldung ausgeben
     * 
     * @param iStars
     * @param sMessage
     */
    private static void outputStardEnd(int iStars, String sMessage) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < iStars; j++) {
                System.out.print("*");
            }

            System.out.print(sMessage);
            sMessage = "";
        }

        System.out.print("\n");
    }

    /**
     * TicTacToe-Spiel starten
     * 1. Spielfeld initialisieren und ausgeben
     * 2. Abfragen ob der Anwender gegen den Rechner spielen möchte
     * 3. Spielernamen auslesen
     * 4. Eingaben auslesen und validieren
     * 5. Rechner Koordinaten berechnen lassen
     * 6. Koordinaten setzen
     * 7. Spielfeld ausgeben
     * 8. Prüfen ob der aktuelle Spieler gewonnen hat
     * 
     * @param aPlayfield
     * @param oScanner
     * @param oRandom
     */
    private static void startGame(char[][] aPlayfield, Scanner oScanner, Random oRandom) {
        // --| Deklaration |--
        char cTurnChar;
        boolean bPCTurn = false,
                bPlayAgainstPC = false;
        String sInput,
                sCurrPlayer,
                sPlayer1,
                sPlayer2 = "PC";

        // --| Spielfeld initialiseren und ausgeben |--
        TicTacToe.printArray2(aPlayfield, true);

        /*
         * Abfragen ob der User gegen den Rechner spielen möchte oder
         * gegen einen weiteren "echten" Menschen
         */
        System.out.print("Wollen Sie gegen den Rechner spielen [y/Y]?");
        sInput = oScanner.nextLine();
        bPlayAgainstPC = (sInput.contains("y") || sInput.contains("Y") ? true : false);

        // Namen für Spieler 1 auslesen
        System.out.print("Erfassen Sie den Namen des ersten Spielers: ");
        sPlayer1 = oScanner.nextLine();

        /*
         * Es wird nicht gegen den Rechner gespielt
         * -> Namen für den zweiten Spieler auslesen
         */
        if (!bPlayAgainstPC) {
            System.out.print("Erfassen Sie den Namen für den zweiten Spieler: ");
            sPlayer2 = oScanner.nextLine();
        }

        // --| Ein Spiel kann max. 9 Runden dauern (3x3) |--
        for (int i = 0; i < 9; i++) {
            /*
             * 1. Setzen des aktuellen Spielers + dessen Spielzeichen
             * 2. Setzen ob der Rechner an der Reihe ist
             */
            if (i % 2 == 0) {
                sCurrPlayer = sPlayer1;
                cTurnChar = 'x';
                bPCTurn = false;
            } else {
                sCurrPlayer = sPlayer2;
                cTurnChar = 'o';
                bPCTurn = bPlayAgainstPC;
            }

            /*
             * 1. User ist am Zug
             * 3.1 Eingabe aus der Konsole auslesen
             * 3.2 Eingabe validieren
             * 3.3 Koordinaten belegen
             * 2. Rechner ist am Zug
             * 2.1 ToDo
             */
            TicTacToe.setTurn(bPCTurn, sCurrPlayer, cTurnChar, aPlayfield, oScanner, oRandom);
            // Spielfeld ausgeben
            TicTacToe.printArray2(aPlayfield, false);

            // --| Prüfen ob der aktuelle Spieler gewonnen hat |--
            if (TicTacToe.checkWin(cTurnChar, sCurrPlayer, aPlayfield)) {
                break;
            }

            // --| Unentschieden, keiner hat verloren |--
            if ((i + 1) == 9) {
                System.out.println("Unentschieden!");
            }
        }
    }

    /**
     * ToDo
     * 
     * @param cTurnChar
     * @param sPlayer
     * @param aPlayfield
     * @param oRandom
     * @return
     */
    private static int[] pcTurn(char cTurnChar, String sPlayer, char[][] aPlayfield, Random oRandom) {
        // --| Deklaration |--
        int iIndex = 0;
        int[] aAvailRow = null,
                aAvailColumn = null,
                aCoordinate = null;

        /*
         * Spielfeld überprüfen ob der gegnerische Spieler einen möglichen 
         * Sieg eringen könnte. Dies wird unterbunden indem die Koordinate
         * mit dem Spielzeichen des Computers belegt wird
         */
        aCoordinate = TicTacToe.checkVicThwarted(cTurnChar, aPlayfield);

        // --| Ermittlung der freien Koordinaten auf dem Spielfeld |--
        if (aCoordinate == null) {
            aCoordinate = new int[2];

            for (int k = 0; k < 2; k++) {
                for (int i = 0; i < aPlayfield.length; i++) {
                    for (int j = 0; j < aPlayfield[i].length; j++) {
                        if (aPlayfield[i][j] == _scPlayfield) {
                            if (k > 0) {
                                aAvailRow[iIndex] = (i + 1);
                                aAvailColumn[iIndex] = (j + 1);
                            }

                            iIndex++;
                        }
                    }
                }

                // Arrays erzeugen und Index zurücksetzen für zweiten durchlauf
                if (k == 0) {
                    aAvailRow = new int[iIndex];
                    aAvailColumn = new int[iIndex];

                    iIndex = 0;
                }
            }

            // Koordinaten zufällig bestimmen
            iIndex = oRandom.nextInt(0, aAvailRow.length);
            aCoordinate[0] = aAvailRow[iIndex];
            aCoordinate[1] = aAvailColumn[iIndex];
        }

        System.out.println(sPlayer + " - hat folgende Koordinaten gewählt [Zeile,Spalte]: " + aCoordinate[0] + ","
                + aCoordinate[1]);

        return aCoordinate;
    }

    /**
     * Das aktuelle Spielfeld wird überprüft, ob der Gegner 
     * einen möglichen Sieg eringen könnte. Sollte dies der 
     * Fall sein, muss dies dringend verhindert werden.
     * 
     * @param cTurnChar
     * @param aPlayfield
     * @return
     */
    private static int[] checkVicThwarted(char cTurnChar, char[][] aPlayfield) {
        // --| Deklaration |--
        int iXY;
        char cEnemyTurn = (cTurnChar == 'x' ? 'o' : 'x');
        int[] aCoordinate = new int[2];

        // --| Horizontale, vertikale und schräge Siege verhindern |--
        try {
            for (int i = 0; i < aPlayfield.length; i++) {
                iXY = (i+1);
                
                // Horizontalen Sieg verhindern -> |x|x|-|
                if (aPlayfield[i][0] == cEnemyTurn && aPlayfield[i][1] == cEnemyTurn && aPlayfield[i][2] == _scPlayfield) {
                    aCoordinate[0] = iXY;
                    aCoordinate[1] = 3;

                    throw new Exception();
                }
                // Horizontalen Sieg verhindern -> |-|x|x|
                else if (aPlayfield[i][0] == _scPlayfield && aPlayfield[i][1] == cEnemyTurn && aPlayfield[i][2] == cEnemyTurn) {
                    aCoordinate[0] = iXY;
                    aCoordinate[1] = 1;

                    throw new Exception();
                }
                // Horizontaler Sieg verhindern -> |x|-|x|
                else if (aPlayfield[i][0] == cEnemyTurn && aPlayfield[i][1] == _scPlayfield && aPlayfield[i][2] == cEnemyTurn){
                    aCoordinate[0] = iXY;
                    aCoordinate[1] = 2;

                    throw new Exception();
                }
                /*
                 * Vertikalen Sieg verhindern:
                 * |x|
                 * |x|
                 * |-| 
                 */
                else if (aPlayfield[0][i] == cEnemyTurn && aPlayfield[1][i] == cEnemyTurn && aPlayfield[2][i] == _scPlayfield) {
                    aCoordinate[0] = 3;
                    aCoordinate[1] = iXY;

                    throw new Exception();
                }
                /*
                 * Vertikalen Sieg verhindern:
                 * |-|
                 * |x|
                 * |x|
                 */
                else if (aPlayfield[0][i] == _scPlayfield && aPlayfield[1][i] == cEnemyTurn && aPlayfield[2][i] == cEnemyTurn) {
                    aCoordinate[0] = 1;
                    aCoordinate[1] = iXY;

                    throw new Exception();
                }
                /*
                 * Vertikalen Sieg verhindern:
                 * |x|
                 * |-|
                 * |x|
                 */
                else if (aPlayfield[0][i] == cEnemyTurn && aPlayfield[1][i] == _scPlayfield && aPlayfield[2][i] == cEnemyTurn){
                    aCoordinate[0] = 2;
                    aCoordinate[1] = iXY;

                    throw new Exception();
                }
            }

            /*
             * Schrägen Sieg verhindern:
             * |x|
             * |-|x|
             * |-|-|-|
             */
            if (aPlayfield[0][0] == cEnemyTurn && aPlayfield[1][1] == cEnemyTurn && aPlayfield[2][2] == _scPlayfield) {
                aCoordinate[0] = 3;
                aCoordinate[1] = 3;

                throw new Exception();
            } 
            /*
             * Schrägen Sieg verhindern:
             * |-|
             * |-|x|
             * |-|-|x|
             */
            else if (aPlayfield[0][0] == _scPlayfield && aPlayfield[1][1] == cEnemyTurn && aPlayfield[2][2] == cEnemyTurn) {
                aCoordinate[0] = 1;
                aCoordinate[1] = 1;

                throw new Exception();
            }
            /*
             * Schrägen Sieg verhindern:
             * |x|
             * |-|-|
             * |-|-|x|
             */
            else if (aPlayfield[0][0] == cEnemyTurn && aPlayfield[1][1] == _scPlayfield && aPlayfield[2][2] == cEnemyTurn) {
                aCoordinate[0] = 2;
                aCoordinate[1] = 2;

                throw new Exception();
            }
            /*
             * Schrägen Sieg verhindern:
             * |-|-|x|
             * |-|x|
             * |-|
             */

            else if (aPlayfield[0][2] == cEnemyTurn && aPlayfield[1][1] == cEnemyTurn && aPlayfield[2][0] == _scPlayfield){
                aCoordinate[0] = 3;
                aCoordinate[1] = 1;

                throw new Exception();
            }
            /*
             * Schrägen Sieg verhindern:
             * |-|-|-|
             * |-|x|
             * |x|
             */
            else if (aPlayfield[0][2] == _scPlayfield && aPlayfield[1][1] == cEnemyTurn && aPlayfield[2][0] == cEnemyTurn ){
                aCoordinate[0] = 1;
                aCoordinate[1] = 3;

                throw new Exception();
            }
            /*
             * Schrägen Sieg verhindern:
             * |-|-|x|
             * |-|-|
             * |x|
             */
            else if (aPlayfield[0][2] == cEnemyTurn && aPlayfield[1][1] == _scPlayfield && aPlayfield[2][0] == cEnemyTurn){
                aCoordinate[0] = 2;
                aCoordinate[1] = 2;

                throw new Exception();
            }

            /*
             * Es muss noch kein Sieg verhindert werden
             * -> Koordinaten-Array auf null setzen
             */
            aCoordinate = null;
        } catch (Exception e) {
        }

        return aCoordinate;
    }

    /**
     * Prüfungen durchführen, ob der aktuelle Spieler gewonnen hat:
     * 1. Horizontal gewonnen
     * 2. Vertikal gewonnen
     * 3. Schräg gewonnen
     * 
     * @param cTurnChar
     * @param sPlayer
     * @param aPlayfield
     * @return
     */
    private static boolean checkWin(char cTurnChar, String sPlayer, char[][] aPlayfield) {
        // --| Deklaration |--
        String sWinOutput = sPlayer + " hat";
        boolean bWin = false;

        // --| Überprüfung ob der aktuelle Spieler gewonnen hat |--
        for (int i = 0; i < aPlayfield.length; i++) {
            // Horrizontal gewonnen
            if (aPlayfield[i][0] == cTurnChar && aPlayfield[i][1] == cTurnChar && aPlayfield[i][2] == cTurnChar) {
                bWin = true;
                sWinOutput = sWinOutput + " horizontal gewonnen!";
                break;
            }

            // Vertikal gewonnen
            if (aPlayfield[0][i] == cTurnChar && aPlayfield[1][i] == cTurnChar && aPlayfield[2][i] == cTurnChar) {
                bWin = true;
                sWinOutput = sWinOutput + " vertikal gewonnen!";
                break;
            }
        }

        // Schräg gewonnen
        if ((aPlayfield[0][0] == cTurnChar && aPlayfield[1][1] == cTurnChar && aPlayfield[2][2] == cTurnChar)
                || (aPlayfield[0][2] == cTurnChar && aPlayfield[1][1] == cTurnChar && aPlayfield[2][0] == cTurnChar)) {
            bWin = true;
            sWinOutput = sWinOutput + " schräg gewonnen!";
        }

        // Aktueller Spieler hat gewonnen!
        if (bWin) {
            System.out.println(sWinOutput);
        }

        return bWin;
    }

    /**
     * ToDo
     * 
     * @param bPCTurn
     * @param sPlayer
     * @param cTurnChar
     * @param aPlayfield
     * @param aCoordinate
     * @param oScanner
     * @param oRandom
     */
    private static void setTurn(boolean bPCTurn, String sPlayer, char cTurnChar, char[][] aPlayfield,
            Scanner oScanner, Random oRandom) {
        // --| Deklaration |--
        int[] aCoordinate;

        // --| Eingabe aus der Konsole auslesen und validieren |--
        if (!bPCTurn) {
            aCoordinate = TicTacToe.getInput(sPlayer, aPlayfield, oScanner);
        }
        // --| PC hat sich Koordinaten ausgewählt |--
        else {
            aCoordinate = TicTacToe.pcTurn(cTurnChar, sPlayer, aPlayfield, oRandom);
        }

        // Koordinaten setzen
        aPlayfield[(aCoordinate[0] - 1)][(aCoordinate[1] - 1)] = cTurnChar;
    }

    /**
     * Konsolen-Eingabe des Users auslesen und validieren
     * 
     * @param sPlayer
     * @param aPlayfield
     * @param aCoordinate
     * @param oScanner
     */
    private static int[] getInput(String sPlayer, char[][] aPlayfield, Scanner oScanner) {
        // --| Deklaration |--
        String sInput;
        int[] aCoordinate;

        // --| Eingabe aus der Konsole lesen |--
        while (true) {
            try {
                System.out.print(
                        sPlayer + " - Koordinaten (1-3) im folgenden Format erfassen [Zeile,Spalte]: ");
                sInput = oScanner.nextLine();

                // Eingabe bei dem Zeichen ',' aufsplitten und dem
                // int-Array zuweisen
                try {
                    aCoordinate = Arrays.stream(sInput.split(",")).mapToInt(Integer::parseInt).toArray();
                } catch (NumberFormatException eConvError) {
                    throw new Exception("Eingabe war kein numerischer Wert!");
                }

                // Eingabe hat das falsche Format gehabt!
                if (aCoordinate.length < 2 || aCoordinate.length > 2) {
                    throw new Exception("Bitte folgendes Format beachten [Zeile,Spalte].");
                }

                /*
                 * Eingabe wird auf folgendes überprüft:
                 * 1. Liegt die Eingabe für die Zeile im Wertebereich 1-3
                 * 2. Liegt die Eingabe für die Spalte im Wertebereich 1-3
                 * 3. Sind die erfassten Koordinaten bereits belegt?
                 */
                TicTacToe.validateTurn(aPlayfield, aCoordinate);
                break;
            } catch (Exception eError) {
                System.out.println("****************************************************");
                System.out.println("ERROR !!! -> " + eError.getMessage());
                System.out.println("****************************************************\n");
            }
        }

        return aCoordinate;
    }

    /**
     * Eingabe wird auf folgendes überprüft:
     * 1. Liegt die Eingabe für die Zeile im Wertebereich 1-3
     * 2. Liegt die Eingabe für die Spalte im Wertebereich 1-3
     * 3. Sind die erfassten Koordinaten bereits belegt?
     * 
     * @param aPlayfield
     * @param iRow
     * @param iColumn
     * @throws Exception
     */
    private static void validateTurn(char[][] aPlayfield, int[] aCoordinate) throws Exception {
        // Zeileneingabe liegt nicht im Wertebereich 1-3
        if (aCoordinate[0] <= 0 || aCoordinate[0] > 3) {
            throw new Exception("Eingabe Zeile (Wert: " + aCoordinate[0] + ") liegt nicht im Bereich 1-3.");
        }

        // Spalteneingabe liegt nicht im Wertebereich 1-3
        if (aCoordinate[1] <= 0 || aCoordinate[1] > 3) {
            throw new Exception("Eingabe Spalte (Wert: " + aCoordinate[1] + ") liegt nicht im Bereich 1-3.");
        }

        // Erfasste Koordinaten sind bereits belegt
        if (aPlayfield[(aCoordinate[0] - 1)][(aCoordinate[1] - 1)] != _scPlayfield) {
            throw new Exception("Koordinaten sind bereits belegt!");
        }
    }

    /**
     * Gebe das TicTacToe-Spielfeld aus
     * -> bCreateField == true -> Spielfeld wird erstellt
     * 
     * @param aPlayfield
     * @param bCreateField
     */
    private static void printArray2(char[][] aPlayfield, boolean bCreateField) {
        // Spielfeld ausgeben
        for (int i = 0; i < aPlayfield.length; i++) {
            for (int j = 0; j < aPlayfield[i].length; j++) {
                // Kenner gesetzt, dass das Spielfeld initialisiert wurde
                aPlayfield[i][j] = (bCreateField == true ? aPlayfield[i][j] = _scPlayfield : aPlayfield[i][j]);
                System.out.print("|" + aPlayfield[i][j]);
            }
            System.out.println("|");
        }

        System.out.print("\n");
    }
}
