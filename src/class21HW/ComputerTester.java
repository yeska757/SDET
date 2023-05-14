package class21HW;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers = {
                new Apple(3000, 16, "iOS", true),
                new Lenovo(1500, 8, "Windows 10", true),
                new HP(1200, 12, "Windows 10", "123456789"),
                new Dell(2000, 16, "Windows 10", true, true)
        };

        for (Computer computer : computers) {
            computer.powerOn();
            computer.powerOff();

            if (computer instanceof HP hpComputer) {
                hpComputer.firstComputer();
            } else if (computer instanceof Dell dellComputer) {
                dellComputer.popular();
            }


        }
    }
}
