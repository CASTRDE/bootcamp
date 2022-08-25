package Transportation;

public class Train extends PriceChecker {
    public void checkTranspo(int price){
        System.out.println("Is train possible? " + (price<=500));
    }
}
