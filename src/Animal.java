import java.time.LocalDate;
import java.util.List;

public class Animal {
    private String name;
    private LocalDate birthday;
    private List<String> vaccinations;
    private String illness;
    private String ownerName;

    public Animal(String name, LocalDate birthday, List<String> vaccinations, String illness, String ownerName) {
        this.name = name;
        this.birthday = birthday;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    private void wakeUp() {
        System.out.println("Animal is wake up");
    }
    private void wakeUp(int time) {
        System.out.println("Animal is wake up in " + time);

    }
    private void eat() {
        System.out.println("Animal ate");
    }
    private void play() {
        System.out.println("Animal played");
    }
    private void sleep() {
        System.out.println("Animal sleeping");
    }
    public void lifeCycle() {
        wakeUp();
        eat();
        play();
        sleep();
    }
    public void toGo() {
        //System.out.println("Animal can move");
    }
    public void fly() {
        //System.out.println("Animal can fly ");
    }
    public void swim() {
        //System.out.println("Animal can swim");
    }

}
