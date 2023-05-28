package class25HW.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InsuranceTester {
    public static void main(String[] args) {

        List<Insurance> insurances = new ArrayList<>();

        insurances.add(new Car("CarInsu", "Mazda3"));
        insurances.add(new Pet("PetInc", "cat"));
        insurances.add(new Health("HealthIns"));

        for (Insurance insurance : insurances) {
            System.out.println(insurance.insuranceName);
            insurance.getQuote();
            insurance.cancelInsurance();
        }

        Iterator<Insurance> it = insurances.iterator();
        while (it.hasNext()) {
            Insurance insurance = it.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }


    }
}
