public class PolicyHolder {
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   public PolicyHolder(PolicyHolder other) {
      firstName = other.firstName;
      lastName = other.lastName;
      age = other.age;
      smokingStatus = other.smokingStatus;
      height = other.height;
      weight = other.weight;
   }
   
   public void setFirstName(String n) {
      firstName = n;
   }
   
   public String getFirstName() {
      return firstName;
   }
   
   public void setLastName(String n) {
      lastName = n;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public void setAge(int a) {
      age = a;
   }
   
   public int getAge() {
      return age;
   }
   
   public void setSmokingStatus(String s) {
      smokingStatus = s;
   }
   
   public String getSmokingStatus() {
      return smokingStatus;
   }
   
   public void setHeight(double h) {
      height = h;
   }
   
   public double getHeight() {
      return height;
   }
   
   public void setWeight(double w) {
      weight = w;
   }
   
   public double getWeight() {
      return weight;
   }
   
   public double calculateBMI() {
      return (weight * 703.0) / (height * height);
   }
   
   public double calculatePrice() {
      double price = 600;
      
      if (age > 50) {
         price += 75;
      }
      
      if (smokingStatus.equalsIgnoreCase("smoker")) {
         price += 100;
      }
      
      if (calculateBMI() > 35) {
         price += (calculateBMI() - 35) * 20;
      }
      
      return price;
   }

   public String toString() {
      return
         "Policyholder's First Name: " + firstName
         + "\nPolicyholder's Last Name: " + lastName
         + "\nPolicyholder's Age: " + age
         + "\nPolicyholder's Smoking Status: " + smokingStatus
         + "\nPolicyholder's Height: " + height
         + "\nPolicyholder's Weight: " + weight
         + String.format("\nPolicyholder's BMI: %.2f", calculateBMI())
         + String.format("\nPolicy Price: $%.2f", calculatePrice());
   }  
}
