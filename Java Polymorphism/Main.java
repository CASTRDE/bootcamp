/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Printer statement1 = new Printer();
        statement1.print();

        ColorPrinter statement2 = new ColorPrinter();
        statement2.print();

        BWPrinter statement3 = new BWPrinter();
        statement3.print("black and white");
    }
}