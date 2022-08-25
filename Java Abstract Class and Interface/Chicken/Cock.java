package Chicken;

public class Cock implements ChickenInterface {
    public void calculatePrice(){
        int price = 5;
        int total = 100/price;
        System.out.println("[For a cock]");
        System.out.println("The price of a cock: "+price);
        System.out.println("Total cocks: "+String.format("%d", total)+"\n");
    }
}
