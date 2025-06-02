import java.util.Scanner;

public class ProjectNoahBlau {
   public static void main(String[] args) {
      // create scanner for reading keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the Policy Number: ");
      int number = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      int age = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      double height = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      double weight = keyboard.nextDouble();
      
      // create an instance of the Policy class
      Policy policy = new Policy(
         number,
         providerName,
         firstName,
         lastName,
         age,
         smokingStatus,
         height,
         weight
      );
      
      // print out Policy information
      System.out.println("Policy Number: " + policy.getNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight());
      System.out.println("Policyholder's Weight: " + policy.getWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());
   }
}