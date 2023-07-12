package class11;

public class E3Array2DstringsEnhanced {
    public static void main(String[] args) {

        String[][] names = {{"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Helima", "Alina", "Semir"}};

        for (String[] name : names) {
            for (String all : name) {
                System.out.print(all + " ");

            }
            System.out.println();
        }


    }
}
