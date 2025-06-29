import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class ProjectNoahBlau {
   public static void main(String[] args) throws IOException {
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      // open policy information file
      Scanner inputFile = new Scanner(new File("PolicyInformation.txt"));
      
      int number;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      while (inputFile.hasNext()) {
         number = inputFile.nextInt();
         inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         if (inputFile.hasNext())
            inputFile.nextLine();
         if (inputFile.hasNext())
            inputFile.nextLine();
         
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
         
         policyList.add(policy);
      }
      
      // close the file
      inputFile.close();
      
      int numSmokers = 0;
      
      for (Policy policy : policyList) {
         if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
            numSmokers++;
                                
         System.out.println("Policy Number: " + policy.getNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight());
         System.out.println("Policyholder's Weight: " + policy.getWeight());
         System.out.printf("Policyholder's BMI: %.2f\n", policy.calculateBMI());
         System.out.printf("Policy Price: $%.2f\n\n", policy.calculatePrice());
      }
      
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers));
   }
}