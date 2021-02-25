import java.util.Scanner;
public class Person {
    // Attributes1
    String name;
    String surname;
    int ID;
    String role;
    String contactDetails;

    public static Scanner s = new Scanner(System.in);

    //construtor for Person
    public Person(String name, String surname, int ID, String role, String contactDetails) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.role = role;
        this.contactDetails = contactDetails;
    }

    public String toString() {
        String output = "Name: " + name;
        output += "\nSurname:" + surname;
        output += "\nID:" + ID;
        output += "\nRole:" + role;
        output += "\nContact details:" + contactDetails;

        return output;
    }

    public void updateContactDetails() {
        System.out.println("\n=== Enter new contact details ===\n");
        this.contactDetails = s.next();
        this.toString();
    }
}