import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable, Goable{
    public Eagle(String name, LocalDate birthday, List<String> vaccinations, String illness, String ownerName) {
        super(name, birthday, vaccinations, illness, ownerName);
    }

    @Override
    public double fly() {
        System.out.printf("%s flying", type);
        return 20;
    }


    public double run() {
        System.out.printf("%s going", type);
        return 0;
    }


    public double run(double a, double b) {
        return 0;
    }

    @Override
    public double acceleration() {
        return Goable.super.acceleration();
    }

//    @Override
//    public void lifeCycle() {
//
//    }

//    @Override
//    public void fly() {
//        super.fly();
//        System.out.println("Birds can fly");
//    }
//
//    @Override
//    public void swim() {
//        super.swim();
//        System.out.println("Birds can't swim");
//    }
//
//    @Override
//    public void toGo() {
//        super.toGo();
//        System.out.println("Birds can move");
//    }
}
