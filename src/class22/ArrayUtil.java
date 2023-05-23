package class22;

public interface ArrayUtil {
    //search the array for the number if found return true
    public boolean searchArr(int[] array, int number);

    public double getAvg(double[] array);

    public int getCount(double[] arr, double number);

    public int add(int num1, int num2);
}

class Main implements ArrayUtil {

    @Override
    public boolean searchArr(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }

        }
        return false;
    }


    @Override
    public double getAvg(double[] array) {
        double sum = 0;
        for (double i : array) {
            sum += i;
        }
        return sum / (array.length);
    }

    @Override
    public int getCount(double[] arr, double number) {
        int count = 0;
        for (double i : arr) {
            if (i == number) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int add(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
}


class ArrayTester {
    public static void main(String[] args) {
        Main find = new Main();
        System.out.println(find.searchArr(new int[]{1, 2, 3, 4, 5, 6, 7}, 6));

        System.out.println(find.getAvg(new double[]{1.3, 2.5, 3.6, 4.8, 5.9, 6.2, 7.4}));

        System.out.println(find.getCount(new double[]{1.3, 3.3, 3.6, 4.8, 3.3, 6.2, 7.4}, 3.3));
    }

}