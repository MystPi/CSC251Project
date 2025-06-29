import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class PolicyDemo {
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
            
         // create policy holder
         PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         
         // create an instance of the Policy class
         Policy policy = new Policy(number, providerName, policyHolder);
         
         policyList.add(policy);
      }
      
      // close the file
      inputFile.close();
      
      int numSmokers = 0;
      
      for (Policy policy : policyList) {
         if (policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
            numSmokers++;
                                
         System.out.println(policy);
         System.out.println();
      }
      
      System.out.printf("There were %d Policy objects created.\n", Policy.getPolicyCount());
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (Policy.getPolicyCount() - numSmokers));
   }
}