package Transportation;

public class Bus extends PriceChecker {
    public void checkTranspo(int price){
        System.out.println("Is bus possible? " + (price<=500));
    }
}
