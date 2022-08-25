package Transportation;

public class Car extends PriceChecker{
    public void checkTranspo(int price){
        System.out.println("Is car possible? " + (price<=500));
    }
}
