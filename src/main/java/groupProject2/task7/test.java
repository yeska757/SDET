package groupProject2.task7;

public class test {
    public static void main(String[] args) {

        Marks[] marks = {new A(99.8, 88.7, 77.6), new B(56.7, 67.8, 78.9, 89.0)};
        for (Marks mark : marks) {
            System.out.println(mark.getPercentage());
        }

    }
}
