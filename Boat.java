public class Boat extends Vehicle {
    public Boat(String name, Integer kilometers) {
        super(name, kilometers);
    }
    @Override
    public String doStuff() {
        return  "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}
