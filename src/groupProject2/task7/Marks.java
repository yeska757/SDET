package groupProject2.task7;

/*
7. We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters
    and the marks in four subjects as its parameters for student B.
    Test your code
*/

public abstract class Marks {

    double math;
    double eng;
    double chem;



    Marks(double math, double eng, double chem) {
        this.math = math;
        this.eng = eng;
        this.chem = chem;
    }

    public abstract double getPercentage();

}
