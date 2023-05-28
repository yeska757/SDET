package class9HW;

public class class9HW2arraysGroupNames {
    public static void main(String[] args) {

        //Create an array of names and store all names of your group.
        // Then print your name from that array. (use 2 different ways of creating an array).

        String[] groupNames = new String[11];
        groupNames[0] = "Yauheniya";
        groupNames[1] = "Hamdan";
        groupNames[2] = "Innessa";
        groupNames[3] = "Karen";
        groupNames[5] = "Luis";
        groupNames[6] = "Ouma";
        groupNames[7] = "Siarhei";
        groupNames[8] = "Tsanita";
        groupNames[9] = "Vonny";
        groupNames[10] = "Youmna";
        System.out.println(groupNames[0]);

        //or

        String[] names = {"Yauheniya", "Hamdan", "Innessa", "Karen", "Luis", "Ouma", "Siarhei", "Tsanita", "Vonny", "Youmna"};
        System.out.println(names[0]);

    }
}
