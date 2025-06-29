public class Policy {
   private int number;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public Policy() {
      number = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "non-smoker";
      height = 0;
      weight = 0;
   }
   
   public Policy(
      int number,
      String providerName,
      String firstName,
      String lastName,
      int aage,
      String smokingStatus,
      double height,
      double weight
   ) {
      this.number = number;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   public void setNumber(int num) {
      number = num;
   }
   
   public int getNumber() {
      return number;
   }
   
   public void setProviderName(String n) {
      providerName = n;
   }
   
   public String getProviderName() {
      return providerName;
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
}
