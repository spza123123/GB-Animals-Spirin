import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{
    public Eagle(String name, LocalDate birthday, List<String> vaccinations, String illness, String ownerName) {
        super(name, birthday, vaccinations, illness, ownerName);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Birds can fly");
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("Birds can't swim");
    }

    @Override
    public void toGo() {
        super.toGo();
        System.out.println("Birds can move");
    }
}
