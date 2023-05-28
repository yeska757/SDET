package class10HW;

public class class10HW1NameGrade {
    public static void main(String[] args) {

        /* Create a 2D array(shorter way) in which first array will consist of 4 names
                and second array will contain grades.
            Then your program should print name of the students that has A and B grade
         */

        String[][] nameGrade = {{"Mike", "Kate", "John", "Sarah"},
                {"B", "C", "D", "A"}};

        for (int col = 0; col < nameGrade[1].length; col++) {
            if (nameGrade[1][col].equals("A") || nameGrade[1][col].equals("B")) {
                System.out.println(nameGrade[0][col] + " has a grade " + nameGrade[1][col]);
            }
        }

    }
}
