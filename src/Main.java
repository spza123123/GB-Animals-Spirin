import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Cat barsik = new Cat("Барсик",
            LocalDate.of(2023,5,3),
            new ArrayList<>(), "Chumka", "Nicolai", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());
        Animal eagle = new Eagle("Kesha",
                LocalDate.of(2023,5,3),
                new ArrayList<>(), "Chumka", "Nicolai");
        Animal nemo = new Fish("Nemo",
                LocalDate.of(2023,5,3),
                new ArrayList<>(), "Chumka", "Sasha");
        List<Animal> animals = new ArrayList<>();
        animals.add(barsik);
        animals.add(eagle);
        System.out.println("---------------");
        barsik.lifeCycle();
        System.out.println("---------------");
        barsik.fly();
        nemo.fly();
        nemo.swim();
        nemo.toGo();
        eagle.swim();
        eagle.fly();
        eagle.toGo();


    }
}
