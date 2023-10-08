package FiveDay;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Black");
        car.getColor();
        car.setModel("BMW E34");
        car.getModel();
        car.setYearOfRelease(1987);
        car.getYearOfRelease();
    }
}

class Car{
    private String model;
    private String color;
    private int yearOfRelease;
    public void setModel(String model){
        this.model = model;
    }
    public void getModel(){
        System.out.println(model);
    }
    public void setColor(String color){
        this.color = color;
    }
    public void getColor(){
        System.out.println(color);
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void getYearOfRelease() {
        System.out.println(yearOfRelease);
    }
}