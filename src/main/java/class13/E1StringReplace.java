package class13;

public class E1StringReplace {
    public static void main(String[] args) {
        String str = "Batch 16 is good";
        str = str.replace("good", "excellent");   //re-assigns
        System.out.println(str.replace("good", "excellent"));  //re-assigns in print only
        System.out.println(str);
        System.out.println(str.replace('e', 'E'));  //can replace all characters


    }
}
