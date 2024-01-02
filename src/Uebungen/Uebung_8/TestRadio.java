package Uebungen.Uebung_8;

public class TestRadio {
    public static void main(String[] args){
        Radio oRadio = new Radio(false, 0, 0);
        oRadio.lauter(5);
        oRadio.leiser(5);
        oRadio.wahleSender(86.0F);
        oRadio.an();

        oRadio.lauter(20);
        oRadio.leiser(5);

        oRadio.wahleSender(11.0F);
        oRadio.getInfos();
    }
}
