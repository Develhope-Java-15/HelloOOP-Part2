import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person mario = new Person("Ma rio", "Rossi", LocalDate.of(1993, 5, 24));
        Person giulia = new Person("Giu lia", "Ro ssi", LocalDate.of(1996, 5, 24));
        Person maicol = new Person("Maic ol", "Cassarà", LocalDate.of(1996, 2, 24));

        maicol.setFirstName("Mai kol");

        System.out.println(maicol.getDateOfBirth());
    }
}
