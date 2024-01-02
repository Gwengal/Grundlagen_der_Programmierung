package Uebungen.Uebung_8;

public class Zeit {
    private int _iHour;
    private int _iMin;

    public Zeit(int iHour, int iMin) {
        try {
            this.setHour(iHour);
            this.setMin(iMin);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                this.setHour(0);
                this.setMin(0);
            } catch (Exception e1) {
            }
        }
    }

    public int getHour() {
        return this._iHour;
    }

    public int getMin() {
        return this._iMin;
    }

    public void setHour(int i) throws Exception {
        if (i < 0 || i > 23) {
            throw new Exception(
                    String.format("Stunden können nur im Wertebereich 0-23 liegen! Sie haben %02d erfasst.", i));
        }

        this._iHour = i;
    }

    public void setMin(int i) throws Exception {
        if (i < 0 || i > 59) {
            throw new Exception(
                    String.format("Minuten können nur im Wertebereich 0-59 liegen! Sie haben %02d erfasst.", i));
        }

        this._iMin = i;
    }

    public void print(){
        System.out.printf("Uhrzeit: %02d:%02d\n", this.getHour(), this.getMin());
    }
}
