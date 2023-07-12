package class3HW;

public class TemperatureCheck {
    public static void main(String[] args) {

        int temperature = 22;
        if (temperature < 32) {
            System.out.println("Water will freeze with temperature " + temperature);
        } else {
            System.out.println("Water will NOT freeze with temperature " + temperature);
        }
    }
}
