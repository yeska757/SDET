package class14;

public class E5Tester {
    public static void main(String[] args) {

        E5ArrayUtils obj = new E5ArrayUtils();
        int[] arr = {10, 20, 45};
        boolean contNum = obj.contains(arr, 20);
        System.out.println(contNum);

    }
}

