package Uebungen.Uebung_8;

public class Raum {
    private boolean[] _bStunde;

    public Raum(){
        this._bStunde = new boolean[24];
    }

    public void belegen(int iZeit){
        if (this._bStunde[iZeit-1] == true) {
            System.out.printf("Raum ist bereits für die Zeit %2d belegt!\n", iZeit);
        }else{
            this._bStunde[iZeit-1] = true;
            System.out.printf("Raum wurde für die Zeit %2d reserviert\n", iZeit);
        }
    }

    public void loeschen(int iZeit){
        if (this._bStunde[iZeit-1] == false) {
            System.out.printf("Es liegt noch keine Reservierung für die Zeit %2d vor!\n", iZeit);
        }else{
            this._bStunde[iZeit-1] = false;
            System.out.printf("Reservierung für den Raum wurde für die Zeit %2d aufgehoben\n", iZeit);
        }
    }

    public void belegungsPlanDrucken(){
        System.out.println("Belegungsplan für heute: ");
        for (int i = 0; i < this._bStunde.length; i++) {
            System.out.printf("- %2d: %s\n", (i+1), (this._bStunde[i] == true ? "belegt" : "frei"));
        }
    }
}
