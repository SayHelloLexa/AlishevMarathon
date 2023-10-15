package SevenDay;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2000, 40, 10000);
        Airplane airplane2 = new Airplane("Airbus", 2010, 60, 13000);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
