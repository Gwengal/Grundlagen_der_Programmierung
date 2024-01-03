package Uebungen.Uebung_10;

public class Student extends Mensch{
    public Student(String sFach){
        super(sFach);
    }

    @Override
    public String toString() {
        String[] aComplName = this.getClass().getName().split("\\.");
        String sOutput = String.format("%s besucht %s", aComplName[aComplName.length-1], this.getFach());
        
        return sOutput;
    }
    
}
