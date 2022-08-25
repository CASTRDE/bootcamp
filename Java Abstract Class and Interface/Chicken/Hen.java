package Chicken;

public class Hen implements ChickenInterface{
    public void calculatePrice(){
        int price = 3;
        int total = 100/price;
        System.out.println("[For a hen]");
        System.out.println("The price of a hen: "+price);
        System.out.println("Total hen: "+String.format("%d", total)+"\n");
    }
}
