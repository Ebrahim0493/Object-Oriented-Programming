import java.util.Scanner;

public class Poised {
    public static Scanner s = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("Please select an option\n");
        System.out.println("1: Create a new project");
        System.out.println("2: Update due date");
        System.out.println("3: UpdateFee");
        System.out.println("4: Update Contact details for customer");
        System.out.println("5: Update contact details for contractor");
        System.out.println("6: exit");
    }

    public static void main(String[] args) {

        Project project = null;
        Person contractor = null;
        Person customer = null;
        boolean running = true;


        // Variable for a new project
        String dueDate;
        String projectName;
        String addressProject;
        String projectDeadline;
        String complete;
        int projectNumber;
        int erf;
        float fee;
        float paid;

        // Customer variables
        String nameCustomer;
        String surnameCustomer;
        int IDCustomer;
        String contactDetailsCustomer;

        // Contractor variables
        String nameContractor;
        String surnameContractor;
        int IDContractor;
        String roleContractor;
        String contactDetailsContractor;

        while (running) {

            mainMenu();
            int usersChoice = s.nextInt();


            switch (usersChoice) {
                case 1:

                    System.out.println("Please enter customer information");
                    System.out.println("Name");
                    nameCustomer = s.next();
                    System.out.println("Surname");
                    surnameCustomer = s.next();
                    System.out.println("ID Number");
                    IDCustomer = s.nextInt();
                    System.out.println("Enter Phone Number");
                    contactDetailsCustomer = s.next();
                    //customer instance
                    customer = new Person(nameCustomer, surnameCustomer, IDCustomer, "customer", contactDetailsCustomer);

                    System.out.println("Enter Contractor Details");
                    System.out.println("Name");
                    nameContractor = s.next();
                    System.out.println("Surname");
                    surnameContractor = s.next();
                    System.out.println("ID Number");
                    IDContractor = s.nextInt();
                    System.out.println("Job Description");
                    roleContractor = s.next();
                    System.out.println("Contact Details");
                    contactDetailsContractor = s.next();
                    //New peron instance for contractor
                    contractor = new Person(nameContractor, surnameContractor, IDContractor, "contractor", contactDetailsContractor);

                    System.out.println("Please enter name of Project");
                    projectName = s.next();
                    System.out.println("Please enter Due Date of Project");
                    dueDate = s.next();
                    System.out.println("Please enter address of Project");
                    addressProject = s.next();
                    System.out.println("Please enter deadline of Project");
                    projectDeadline = s.next();
                    complete = ("no");
                    System.out.println("Please enter Project Number");
                    projectNumber = s.nextInt();
                    System.out.println("Please enter erf of Project");
                    erf = s.nextInt();
                    System.out.println("Please enter Fee of Project");
                    fee = s.nextFloat();
                    System.out.println("Please enter amount paid of Project");
                    paid = s.nextFloat();

                    //New Project instance
                    project = new Project(dueDate, projectName, addressProject, projectDeadline, complete, customer, contractor, paid, fee, erf, projectNumber);

                    System.out.println("Project created successfully");
                    project.printProject();

                    break;

                case 2:
                    System.out.println("Please enter new due date");
                    project.updateDueDate();

                    break;
                case 3:
                    System.out.println("Please enter updated Fee Paid");
                    project.updateFee();

                    break;

                case 4:
                    System.out.println("Please enter updated Contact Details for customer");
                    customer.updateContactDetails();

                    break;

                case 5://add if to refactor
                    System.out.println("Please enter updated Contact Details for contractor");
                    contractor.updateContactDetails();

                    break;

                case 6:
                    System.out.println("Thank you goodbye");
                    running = false;

                    break;

                default:
                    System.out.println("Please select a valid number");
                    break;
            }
        }
    }
}