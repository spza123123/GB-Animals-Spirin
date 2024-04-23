import javax.print.Doc;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Cat barsik = new Cat("Барсик",
            LocalDate.of(2023,5,3),
            new ArrayList<>(), "Chumka", "Nicolai", 4);
//        System.out.println(barsik);
//        System.out.println(barsik.getLegsCount());
        Animal eagle = new Eagle("Kesha",
                LocalDate.of(2023,5,3),
                new ArrayList<>(), "Chumka", "Nicolai");
        Animal nemo = new Fish("Nemo",
                LocalDate.of(2023,5,3),
                new ArrayList<>(), "Chumka", "Sasha");
//            System.out.println(barsik.type);
//
//            System.out.println(nemo.type);

            Clinic clinic  = new Clinic();
            clinic.addPatients(barsik, eagle,nemo);
        System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoables());
        System.out.println("--------------");
//        Nurse nurse1 = new Nurse("Valentina", 10,"Yes", true);
//        System.out.println(nurse1);
        System.out.println(clinic.getSwimables());
        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFlyables());


    }
}
