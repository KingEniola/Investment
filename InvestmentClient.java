/**
 * Yetunde Eniola Adegbegha
 * March 1 2022
 */
import java.text.*;
public class InvestmentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Investment person1 = new Investment();           //call default constructor
	    Investment person2 = new Investment("Eniola", 1000 );          //call overload constructor 
	     
	     DecimalFormat icPattern = new DecimalFormat("$#,###.0#");
	     DecimalFormat irPattern = new DecimalFormat("#.0#%");

	  // Test Mutator
	     person1.setInvestorName("Eniola");                
	     person1.setInvestment(1000);

	     System.out.println("                    Welcome to Future Value Investment Calculation");
	  // Test Accessors
	     System.out.println("Investor 1: " + person1.getInvestorName());                                           
	     System.out.println("\t Investor 1 investment: " + icPattern.format(person1.getInvestment()));              
	     System.out.println("\t Investor 1 interest Rate: " + irPattern.format(Investment.getInterestRate()));     
	     //Test futurevalue()
	     System.out.println("\t Investment in 5 years: " + icPattern.format(person1.futurevalue(5)));             
	     System.out.println("\t Investment in 10 years: " + icPattern.format(person1.futurevalue(10)));         
	     System.out.println("\t Investment in 20 years: " + icPattern.format(person1.futurevalue(20)));          
	     //Test toString()
	     System.out.println("Investor 1 investment state is: " + person1.toString());         //explicit call toString()
	     System.out.println("Investor 1 investment state is: " + person1);               //implicit call toString()

	     //Test Accessors
	     String investorname = person2.getInvestorName();
	     System.out.println("Investor 2: " + investorname);
	     
	     double ammount = person2.getInvestment();
	     System.out.println("\t Investor 2 investment: " + icPattern.format(ammount));

	     double rate =Investment.getInterestRate();
	     System.out.println("\t Investor 2 interest Rate: " + irPattern.format(rate));
	     //Test futurevalue()
	     System.out.println("\t Investment in 5 years: " + icPattern.format(person2.futurevalue(5)));
	     System.out.println("\t Investment in 10 years: " + icPattern.format(person2.futurevalue(10)));
	     System.out.println("\t Investment in 20 years: " + icPattern.format(person2.futurevalue(20)));
	   //Test toString()
	     System.out.println("Investor 2 investment state is: " + person2.toString());      //explicit call toString()
	     System.out.println("Investor 2 investment state is: " + person2);           //implicit call toString()
	          
	     // Test equals()
	     if (person1.equals(person2))
				System.out.println("Investor 1 and Investor 2 are in the same state");
			else
				System.out.println("Investor 1 and Investor 2 are not in the same state");


	}

}
