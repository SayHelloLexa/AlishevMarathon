package SixDay;

class Motorbike {
    String model;
    String color;
    int yearOfRelease;
    public Motorbike(String model, String color, int yearOfRelease){
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
    }
    void info(){
        System.out.println("Это мотоцикл");
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
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - yearOfRelease);
    }
}
