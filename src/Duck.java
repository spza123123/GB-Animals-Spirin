import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal implements Goable, Swimable{

    public Duck(String name, LocalDate birthday, List<String> vaccinations, String illness, String ownerName) {
        super(name, birthday, vaccinations, illness, ownerName);
    }



    public double run() {
        System.out.printf("%s is going", type);
        return 5;
    }


//    public double run(double a, double b) {
//
//    };




    @Override
    public double acceleration() {
        return Goable.super.acceleration();
    }

    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 3;
    }
}
