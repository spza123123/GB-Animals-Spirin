import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{
    private int legsCount;
    public Cat(String name, LocalDate birthday, List<String> vaccinations, String illness, String ownerName, int legsCount) {
        super(name, birthday, vaccinations, illness, ownerName);
        this.legsCount = legsCount;
    }


    public int getLegsCount() {
        return legsCount;
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Cats can't fly");
    }

    @Override
    public void toGo() {
        super.toGo();
        System.out.println("Cats can move");
    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("Cats can't swim");
    }
}
