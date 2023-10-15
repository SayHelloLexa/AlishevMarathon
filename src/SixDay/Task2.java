package SixDay;

public class Task2  {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Аэеродинамикс", 2022, 45, 80000);
        airplane.setManufacturer("Аэродинамикс");
        airplane.setYear(2021);
        airplane.setLength(40);
        airplane.setWeigth(80000);
        airplane.setFuel(0);
        airplane.fillUp(10000);
        airplane.fillUp(5000);
        airplane.info();

    }
}
