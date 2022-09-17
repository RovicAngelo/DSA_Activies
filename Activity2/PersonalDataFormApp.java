
/*
 ACTIVITY 2
 Submitted by: Rovic Angelo Lanuza
 Course/year/block: BSIT 2-2
 */

//for the user Inputs
package Activity2;

import java.util.Scanner;

public class PersonalDataFormApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("========== Personal Information ==========");
        System.out.println();

        // prompts for last name
        System.out.print("Last Name : ");
        String lastName = userInput.nextLine();

        // prompts for first name
        System.out.print("First Name : ");
        String firstName = userInput.nextLine();

        // prompts for middle name
        System.out.print("Middle Name : ");
        String middleName = userInput.nextLine();

        // prompts for gender
        System.out.print("Gender (M for Male, F for Female, X for LGBTQ+) : ");
        char gender = userInput.nextLine().charAt(0);

        // prompts for marital status
        System.out.print("Are you single? (Y for Yes, N for No) : ");
        boolean isSingle;
        if (isSingle = userInput.nextLine().equals("Y")) {
            isSingle = true;
        } else {
            isSingle = false;
        }

        // prompts for Birth Date
        System.out.print("Birth Date (MM/dd/yyyy): ");
        String birthDate = userInput.nextLine();

        // prompts for Birth Place
        System.out.print("Birth Place : ");
        String birthPlace = userInput.nextLine();

        System.out.println("========== Contact Information ==========");
        System.out.println();

        // prompts for mobile number
        System.out.print("Mobile Number (Omit +63 or 0) : ");
        Long mobileNumber = Long.parseLong(userInput.nextLine());

        // prompts for email address
        System.out.print("Email Address : ");
        String emailAddress = userInput.nextLine();

        System.out.println();

        // To display the Profile Information in the console
        System.out.println("========== Summary Profile Information ==========");
        System.out.println();
        System.out.println("Full Name : " + firstName + " " + middleName + " " + lastName);
        System.out.println("Gender : " + gender);
        System.out.println("Is single : " + isSingle);
        System.out.println("Birth Date : " + birthDate);
        System.out.println("Birth Place : " + birthPlace);
        System.out.println("Mobile Number : " + "+63" + mobileNumber);
        System.out.println("Email Address : " + emailAddress);

        userInput.close(); // To close the Scanner

    }
}
