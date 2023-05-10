package class19HW;

public class AreaTester {
    public static void main(String[] args) {
        Area calcArea = new Area();

        System.out.println(calcArea.calculateArea(5) + "----------square area-----------");
        System.out.println(calcArea.calculateArea(3, 2) + "----------rectangle area--------");
    }
}
