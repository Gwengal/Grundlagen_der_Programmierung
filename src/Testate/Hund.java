package Testate;

public class Hund {
    // --| Attribute |--
    private String _sName;
    private String _sRace;
    private boolean _bGoodDog;

    // --| Konstruktoren |--
    public Hund(){ }
    private Hund(String sName, String sRace, boolean bGoodDog){
        this.setName(sName);
        this.setRace(sRace);
        this.setGoodBoy(bGoodDog);
    }

    // --| Getter |--
    public String getName(){
        return this._sName;
    }
    public String getRace(){
        return this._sRace;
    }
    public boolean getGoodBoy(){
        return this._bGoodDog;
    }

    // --| Setter |--
    public void setName(String sName){
        this._sName = sName;
    }
    public void setRace(String sRace){
        this._sRace = sRace;
    }
    public void setGoodBoy(boolean bGoodDog){
        this._bGoodDog = bGoodDog;
    }

    /**
     * Instanz für die Klasse Hund erzeugen
     * 
     * @param sName
     * @param sRace
     * @param bGoodDog
     * @return
     */
    public static Hund init(String sName, String sRace, boolean bGoodDog){
        return new Hund(sName, sRace, bGoodDog);
    }

    /**
     * Hund bellt x-Mal
     * 
     * @param iNumb
     */
    public void bark(int iNumb){
        System.out.print(this.getName() + " bellt: ");
        
        for (int i = 0; i < iNumb; i++) {
            System.out.print("Wau");
        }
        System.out.println();

        this.setGoodBoy(false);
    }

    /**
     * Hund schläft
     */
    public void sleep(){
        System.out.println(this.getName() + " schläft gerade: zzzzzzzzzzzzzzzzzzzzzzz");
        this.setGoodBoy(true);
    }

    /**
     * Ausgabe der Instanz des Hundes
     */
    public void print(){
        System.out.println("Der Hund heißt " + this.getName() + " und ist ein " + this.getRace() + ".");
        System.out.println("Er ist " + (this.getGoodBoy() == true ? "brav" : "nicht brav") + ".");
    }
}
