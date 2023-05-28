package class12;

public class DogTester {
    public static void main(String[] args) {

        //className Name = new className();
        Dog actualDog = new Dog();
        actualDog.name = "Jacky";
        actualDog.age = 50;
        actualDog.breed = "German";
        actualDog.color = "Black";
        actualDog.weight = 50;
         actualDog.bark();



         Dog mashaObj = new Dog();
         mashaObj.name = "Masha";
         mashaObj.age = 1;
         mashaObj.breed = "Miniature Poodle";
         mashaObj.color = "Peach";
         mashaObj.weight = 20;
         mashaObj.isFat = false;
         mashaObj.bark();
         mashaObj.eat();
         mashaObj.sleep();










    }
}
