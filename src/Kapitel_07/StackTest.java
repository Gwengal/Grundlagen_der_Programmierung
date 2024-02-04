package Kapitel_07;

public class StackTest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack oStack = new Stack(5);

        try {
            oStack.push(Buch.init("Tolkin", "Das Silmarilion"));
            oStack.push(Buch.init("Tolkin", "Herr der Ringe die Gefährten"));
            oStack.pop().print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
