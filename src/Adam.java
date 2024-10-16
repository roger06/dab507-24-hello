//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// test comment for git test
public class Adam {
    public static void main(String[] args) {
        System.out.println("Hi");

        Vehicle vehicle = new Vehicle("Toyota");
//        System.out.println( vehicle.getClass().toString());
        vehicle.moveit();
        System.out.println("Your car is a "+vehicle.manufacturer);

    }
}
