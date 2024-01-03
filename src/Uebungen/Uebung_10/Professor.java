package Uebungen.Uebung_10;

public class Professor extends Mensch{
    public Professor(String sFach){
        super(sFach);
    }

    @Override
    public String toString() {
        String[] aComplName = this.getClass().getName().split("\\.");
        String sOutput = String.format("%s unterrichtet %s", aComplName[aComplName.length-1], this.getFach());
        
        return sOutput;
    }
}
