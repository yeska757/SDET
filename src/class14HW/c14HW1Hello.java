package class14HW;

public class c14HW1Hello {

    //Create a method that will say Hello in different language based on the country that will be passed when method is executed.

    void language(String country) {
        switch (country) {
            case "France" -> System.out.println("Bonjour");
            case "Germany" -> System.out.println("Guten Tag");
            case "Italy" -> System.out.println("Ciao");
            case "Japan" -> System.out.println("こんにちは");
            case "Spain" -> System.out.println("Hola");
            case "Russia" -> System.out.println("Здравствуйте");
            case "Belarus" -> System.out.println("Вітаю");
            default -> System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        c14HW1Hello hello = new c14HW1Hello();
        hello.language("Belarus");
    }


}
