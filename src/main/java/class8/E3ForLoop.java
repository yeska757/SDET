package class8;

public class E3ForLoop {
    public static void main(String[] args) {

        //write a loop to add all even numbers form 1 to 30 and print sum

        int sum = 0;
        for (int i = 2; i <= 30; i += 2) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);


        //or

        int summ = 0;
        for (int n = 1; n <= 10; n++) {
            if (n % 2 == 0) {
                summ = summ + n;      //summ+=n;
            }
        }
        System.out.println(summ);


    }
}
