public class Car extends Vehicle {
    public Car(String name, Integer kilometers) {
        super(name, kilometers);
    }
    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";
    }
}
