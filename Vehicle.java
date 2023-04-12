public abstract class Vehicle {
    String brand;
    Integer kilometers;
    Vehicle(String brand, Integer kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return this.brand;
    }
    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }
    public Integer getKilometers() {
        return this.kilometers;
    }
    public abstract String doStuff();
}
