package class11;

public class E2Array2Dstrings {
    public static void main(String[] args) {

        String[][] names = {{"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Helima", "Alina", "Semir"}};

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");

            }
            System.out.println();
        }


    }
}
