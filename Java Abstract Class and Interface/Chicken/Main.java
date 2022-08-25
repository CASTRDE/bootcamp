package Chicken;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("How many chickens for a 100 yuan?\n");
        Cock cock = new Cock();
        cock.calculatePrice();

        Hen hen = new Hen();
        hen.calculatePrice();

        Bundle three = new Bundle();
        three.chickenPrice();
    }
}