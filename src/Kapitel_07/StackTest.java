package Kapitel_07;

public class StackTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack oStack = new Stack(5);

        if (!oStack.isFull()) {
            oStack.push(Buch.init("Tolkin", "Das Silmarilion"));
        }
        if (!oStack.isFull()) {
            oStack.push(Buch.init("Tolkin", "Herr der Ringe die Gefährten"));
        }

        if (!oStack.isEmpty()) {
            oStack.pop().print();
        }
    }
}
