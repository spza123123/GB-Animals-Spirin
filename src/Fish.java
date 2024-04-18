import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal{
    public Fish(String name, LocalDate birthday, List<String> vaccinations, String illness, String ownerName) {
        super(name, birthday, vaccinations, illness, ownerName);

    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Fish can't fly :)");
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("Fish can swim");
    }

    @Override
    public void toGo() {
        super.toGo();
        System.out.println("Fish moves only in the water");
    }
}
