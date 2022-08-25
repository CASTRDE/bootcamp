package Chicken;

public class Bundle extends Chicken {
    public void chickenPrice(){
        int price = 1;
        int total = 100/price;
        System.out.println("[For a bundle of 3 chickens]");
        System.out.println("The price of 3 chickens: "+price);
        System.out.println("Total chicken: "+String.format("%d", total*3)+"\n");
    }
}
