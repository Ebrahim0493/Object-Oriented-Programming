import java.util.Scanner;

public class Project {
    // Attributes1
    String dueDate;
    String projectName;
    String addressProject;
    String projectDeadline;
    String complete; // yes || no
    int projectNumber;
    int erf;
    float fee;
    float paid;
    Person customer;
    Person contractor;

    public static Scanner s = new Scanner(System.in);

    // contractor for Person
    public Project(String dueDate, String projectName, String addressProject, String projectDeadline, String complete, Person customer, Person contractor, float paid, float fee, int erf, int projectNumber) {
        this.dueDate = dueDate;
        this.projectName = projectName;
        this.addressProject = addressProject;
        this.projectDeadline = projectDeadline;
        this.complete = complete;
        this.projectNumber = projectNumber;
        this.fee = fee;
        this.paid = paid;
        this.customer = customer;
        this.contractor = contractor;
    }

    public Project() {
    }

    public static void PrintPoject() {
    }

    ;

    public void printProject() {
        String output = "";
        output += "Due date: " + dueDate;
        output += "project Name:" + projectName;
        output += "address Project:" + addressProject;
        output += "project Deadline" + projectDeadline;
        output += "complete:" + complete;
        output += "project Number:" + projectNumber;
        output += "fee:" + fee;
        output += "paid:" + paid;
        output += "customer:" + customer;
        output += "contractor:" + contractor;


        System.out.println(output + "\n");
    }

    public void updateDueDate() {
        System.out.println("\n=== Enter New Date ===\n");
        this.dueDate = s.nextLine();
        this.printProject();
    }

    public void updateFee() {
        System.out.println("\n=== Enter Updated Fee ===\n");
        this.fee = s.nextFloat();
        this.printProject();

        //public void updatePaid() {
            System.out.println("\n=== Enter Updated payment");
            this.paid = s.nextFloat();
            this.printProject();
        }


    }

