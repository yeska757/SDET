package class15;

public class SyntaxEmployee {
    /*Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/

    String empID;
    double salary;
    static String CEO = "Sumair";

    public static void main(String[] args) {
        SyntaxEmployee employee1 = new SyntaxEmployee();
        employee1.empID = "id123";
        employee1.salary = 150000.00;
        System.out.print(employee1.empID + " " + employee1.salary + " " + CEO);

        System.out.println();

        SyntaxEmployee employee2 = new SyntaxEmployee();
        employee2.empID = "id234";
        employee2.salary = 169000.00;
        System.out.print(employee2.empID + " " + employee2.salary + " " + SyntaxEmployee.CEO);


    }


}
