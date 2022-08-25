package Transportation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.checkTranspo(500);

        Bus bus = new Bus();
        bus.checkTranspo(300);

        Train train = new Train();
        train.checkTranspo(400);

        Plane plane = new Plane();
        plane.checkTranspo(1000);
    
    }
}
