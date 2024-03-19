public class Policy
{
   private double policyNumber, policyAge, policyHeight, policyWeight;
   private String providerName, policyFN, polilcyLN, polilcySmoke;
   
   public Policy()
   {
      policyNumber = 1;
      policyAge = 1;
      policyHeight = 1;
      policyWeight = 1;
      providerName = " ";
      policyFN = " ";
      policyLN = " ";
      policySmoke = "smoker";
   }
   
   public Policy(double pN, double pA, double pH, double pW, String pName, String pFirst, String pLast, String pSmoke)
   {
      policyNumber = pN;
      policyAge = pA;
      policyHeight = pH;
      policyWeight = pW;
      providerName = pName;
      policyFN = pFirst;
      ploicyLN = pLast;
      policySmoke = pSmoke;
   }
}