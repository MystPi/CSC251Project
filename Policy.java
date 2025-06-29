public class Policy {
   private int number;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int count = 0;
   
   public static int getPolicyCount() {
      return count;
   }
   
   public Policy(int number, String providerName, PolicyHolder policyHolder) {
      this.number = number;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(policyHolder);
      
      count += 1;
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
   
   public void setPolicyHolder(PolicyHolder policyHolder) {
      this.policyHolder = new PolicyHolder(policyHolder);
   }
   
   public PolicyHolder getPolicyHolder() {
      return new PolicyHolder(policyHolder);
   }
   
   public String toString() {
      return String.format("Policy Number: %d\nProvider Name: %s\n", number, providerName) + policyHolder.toString();
   }
}
