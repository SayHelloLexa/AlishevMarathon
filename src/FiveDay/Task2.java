package FiveDay;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("BMW E34", "Black", 1987);
        motorbike.getModel();
        motorbike.getColor();
        motorbike.getYearOfRelease();
    }
}
class Motorbike{
    String model;
    String color;
    int yearOfRelease;
    public Motorbike(String model, String color, int yearOfRelease){
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }

    public void getModel() {
        System.out.println(model);
    }
    public void getColor(){
        System.out.println(color);
    }

    public void getYearOfRelease() {
        System.out.println(yearOfRelease);
    }
}
