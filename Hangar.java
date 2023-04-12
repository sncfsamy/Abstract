public class Hangar {
    public static void main(String ...args) {
        Car mini = new Car("Mini",127000);
        Boat costa = new Boat("Costa",22);
        System.out.println(mini.doStuff());
        System.out.println(costa.doStuff());
    }
}
