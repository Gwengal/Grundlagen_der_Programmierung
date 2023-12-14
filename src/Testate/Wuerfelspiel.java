package Testate;

import java.util.Random;

public class Wuerfelspiel {
    public static void main(String[] args) {
        Spiel oGame = new Spiel(5);
        oGame.addPlayer(new Spieler("Anna"));
        oGame.addPlayer(new Spieler("Berta"));
        oGame.addPlayer(new Spieler("Cäsar"));
        oGame.addPlayer(new Spieler("Dennis"));
        oGame.play();

        System.out.println(oGame);

        oGame.addPlayer(new Spieler("Emil"));
        oGame.play();
        oGame.sortBest();

        System.out.println(oGame.toString());
    }

    /**
     * Sterne ausgeben
     * 
     * @param iNum
     */
    public static void printStars(){
        for (int i = 0; i < 62; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}

class Wuerfel{
    // --| Klassen-Attribute |--
    private static int _iMaxValue = 6;

    // --| Klassen-Methoden |--
    /**
     * Initialisierung des maximalen Würfelwertes
     * 
     * @param iMaxValue
     */
    public static void init(int iMaxValue){
        Wuerfel._iMaxValue = iMaxValue;
    }

    /**
     * Würfel-Wert aus dem Bereich 1-X zufällig ermitteln
     * 
     * @return
     */
    public static int rollDice(){
        return new Random().nextInt(1, Wuerfel._iMaxValue+1);
    }
}

class Spieler{
    // --| Instanz-Attribute |--
    private String _sName;
    private int _iDiceValue;

    // --| Konstruktoren |--
    public Spieler(String sName){
        this.SetName(sName);
    }

    // --| Getter |--
    public String getName(){
        return this._sName;
    }
    public int getDiceValue(){
        return this._iDiceValue;
    }

    // --| Setter |--
    public void SetName(String sName){
        this._sName = sName;
    }
    public void SetDiceValue(int iDiceValue){
        this._iDiceValue = iDiceValue;
    }
}

class Spiel{
    // --| Instanz-Attribute |--
    private int _iTop;
    private Spieler[] _aPlayers;

    // --| Konstruktoren |--
    public Spiel(int iNumPlayers){
        this.setTop(0);
        this._aPlayers = new Spieler[iNumPlayers];

        Wuerfelspiel.printStars();
        System.out.println("Würfelspiel gestartet!\nErfassen Sie bitte die " + iNumPlayers + " Spieler:");
        Wuerfelspiel.printStars();
    }

    // --| Getter |--
    public int getTop(){
        return this._iTop;
    }

    // --| Setter |--
    public void setTop(int iTop){
        this._iTop = iTop;
    }

    // --| Instanz-Methoden |--
    /**
     * Spieler aufnehmen
     * 
     * @param oPlayer
     * @throws Exception
     */
    public void addPlayer(Spieler oPlayer) {
        if (this.isFull()) {
            System.out.println("Maximale Anzahl an Spielern ist bereits erreicht! " + this.getNum());
            return;
        }

        this._aPlayers[this.getTop()] = oPlayer;
        this.setTop(this.getTop() + 1);

        System.out.println("Spieler " + oPlayer.getName() + " für Spiel aufgenommen. " + this.getNum());
    }

    /**
     * Für jeden Spieler der Reihe nach würfeln
     */
    public void play() {
        if (!this.isFull()) {
            Wuerfelspiel.printStars();
            System.out.println("Liste ist noch nicht voll!\nEs fehlen noch Spieler! " + this.getNum());
            Wuerfelspiel.printStars();

            return;
        }

        Wuerfelspiel.printStars();
        System.err.println("Spiel startet: ");
        Wuerfelspiel.printStars();
        for (Spieler oPlayer : this._aPlayers) {
            oPlayer.SetDiceValue(Wuerfel.rollDice());
        }
    }

    /**
     * Spielerliste zurückgeben
     */
    public String toString(){
        // --| Deklaration |--
        String sReturn = "";

        // --| Spielerliste in einem String zwischenspeichern |--
        for (Spieler oPlayer : this._aPlayers) {
            if (oPlayer == null) {
                continue;
            }
            sReturn = sReturn + "- " + oPlayer.getName() + ": " + oPlayer.getDiceValue() + "\n";
        }

        return sReturn;
    }

    /**
     * Spielerliste aufsteigend sortieren
     */
    public void sortBest(){
        // --| Deklaration |--
        boolean bRun = true;
        Spieler oRemind;

        // --| BubbleSort ausführen |--
        for (int i = 0; i < this._aPlayers.length && bRun == true; i++) {
            bRun = false;

            for (int j = 0; j < this._aPlayers.length - 1; j++) {
                if (this._aPlayers[j].getDiceValue() > this._aPlayers[j + 1].getDiceValue()) {
                    oRemind = this._aPlayers[j + 1];
                    this._aPlayers[j + 1] = this._aPlayers[j];
                    this._aPlayers[j] = oRemind;
                    bRun = true;
                }
            }
        }
    }

    /**
     * Überprüfung ob max Spieleranzahl erreicht wurde
     * 
     * @param oPlayer
     */
    private boolean isFull(){
        return this.getTop() == this._aPlayers.length;
    }

    /**
     * Aktuelle Anzahl als String zurückgeben
     * 
     * @return
     */
    private String getNum(){
        return "(" + this.getTop() + "/" + this._aPlayers.length + ")";
    }
}
