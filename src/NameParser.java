import java.util.Scanner;
public class NameParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String fullName, firstName, lastName, firstNameUpper, lastNameLower;

        System.out.print("Enter full name: ");
        fullName= keyboard.nextLine();
        String[] divided = fullName.split(" ");
        firstName = divided[0];
        lastName = divided[1];

        firstNameUpper = firstName.toUpperCase();
        lastNameLower = lastName.toLowerCase();

        System.out.println("The first name is: " + firstNameUpper);
        System.out.println("The last name is: " +lastNameLower);

        /*Other form to do it
        String fullName;
        String firstName;
        String lastName;

        System.out.print("What is your full name: ");
        fullName = keyboard.nextLine();

        int indexOfSpace =  fullName.indexOf(" ");

        fisrstName = fullName.substring(0, indexOfSpace);
        lastName =  lastName.toLowerCase();

        System.out.println("The first name is: " + firstName);
        System.out.println("The last name is: " +lastName);
        */


    }
}
