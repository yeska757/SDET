package class13;

public class E8StringVsStringBuilderMutability {
    public static void main(String[] args) {

        String str = "1";
        for (int i = 0; i < 100; i++) {
            str+=i;
        }


    }
}
