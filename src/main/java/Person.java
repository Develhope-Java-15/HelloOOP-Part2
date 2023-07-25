import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName.replace(" ", "");
        this.lastName = lastName.replace(" ", "");
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
       this.firstName = firstName.replace(" ", "");
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "{" + this.firstName + " " + this.lastName + ", " + this.dateOfBirth + "}";
    }
}
