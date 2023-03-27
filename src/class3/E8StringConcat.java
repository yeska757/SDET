package class3;

public class E8StringConcat {
    public static void main(String[] args) {

        System.out.println("Leon"+10+10); //Leon1010
        System.out.println("Leon"+(10+10)); //with () addition will be performed first
        System.out.println(10+10+"Leon"); //20Leon

    //left to right rule is not applicable to math
        System.out.println(2*2+2);
        System.out.println(2+2*2);
        System.out.println((2+2)*2);



    }
}
