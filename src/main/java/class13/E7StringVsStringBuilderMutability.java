package class13;

public class E7StringVsStringBuilderMutability {
    public static void main(String[] args) {

        String name = "Marina";
        String name1 = "Abdul";
        String name2 = "Brett";
        String country = "USA";  //in String if same content --> all saved in one same box
        String country1 = "USA";
        String country2 = "USA";

        StringBuilder country4 = new StringBuilder("USA");  // in StringBuilder saves in separate boxes
        StringBuilder country5 = new StringBuilder("USA");
        StringBuilder country6 = new StringBuilder("USA");


    }
}
