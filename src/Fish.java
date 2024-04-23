import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimable{
    public Fish(String name, LocalDate birthday, List<String> vaccinations, String illness, String ownerName) {
        super(name, birthday, vaccinations, illness, ownerName);

    }



    @Override
    public double swim() {
        System.out.printf("%s swiming", type);
        return 2;
    }

//    @Override
//    public void lifeCycle() {
//
//    }


}
