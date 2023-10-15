package SixDay;

class Car {
    private String model;
    private String color;
    private int yearOfRelease;
    private int inputYear;

    void info() {
        System.out.println("Это автомобиль");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void getModel() {
        System.out.println(model);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getColor() {
        System.out.println(color);
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void getYearOfRelease() {
        System.out.println(yearOfRelease);
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - yearOfRelease);
    }
}