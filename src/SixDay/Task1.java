package SixDay;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike("Yamaha", "Black", 2002);
        car.info();
        motorbike.info();
        car.setYearOfRelease(1987);
        System.out.println(car.yearDifference(1980));
        System.out.println(motorbike.yearDifference(1980));
    }
}
