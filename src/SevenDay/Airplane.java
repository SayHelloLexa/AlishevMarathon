package SevenDay;

class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weigth;
    private int fuel;
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if (airplane1.length > airplane2.length) {
            System.out.println("Самолет компании Boeing длиннее");
        }
        System.out.println("Самолет компании Airbus длиннее");
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWeigth(int weigth){
        this.weigth = weigth;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getFuel(){
        return this.fuel;
    }
    public Airplane(String manufacturer, int year, int length, int weigth){
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
    }
    public void info(){
        System.out.print("Изготовитель: " + manufacturer + " год выпуска: " + year + " длина: " + length + " вес: "
                + weigth + " количество топлива в баке: " + fuel);
    }
    public int fillUp(int n){
        return fuel += n;
    }

}
