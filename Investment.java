/**
 * Yetunde Eniola Adegbegha
 * March 1 2022
 */
import java.text.*;
public class Investment {

	private String investorName;
	private double investment;
	private static double interestRate=0.025;      //initialized static interest rate
	
	
	public Investment()     //default constructor
	{
		investorName="";
		investment = 0;
	}
	
	public Investment (String name, double ammount)    // overload constructor
	{
		setInvestorName(name);
		setInvestment(ammount);
	}   
	
	public String getInvestorName() //getter method
	{
		return investorName;
	}
	
	public void setInvestorName(String name)    //setter method
	{
		investorName = name;
	}
	
	public double getInvestment() 
	{
		return investment;
	}
	
	public void setInvestment(double ammount) 
	{
           if (ammount >= 0)
        	   investment = ammount;
           else
        	   investment = 0;
	}
	
	
	public static double getInterestRate() 
	{
		return interestRate;
	}
	
	//calculates future value of an investment
	public double futurevalue(int year)
	{
		  double temp = 1+ interestRate;
	      double FV = investment * (Math.pow(temp, year));
	     
	      return FV;
	}

	//toString()
	public String toString()
	{
		DecimalFormat icPattern = new DecimalFormat("$#,###.0#");
		DecimalFormat irPattern = new DecimalFormat("#.0#%");
	    return "\n \t"+"Investor Name: " + investorName + "\n  \t" +
	            "Investment Ammount: " + icPattern.format(investment) +"\n \t" +
	             "Interest Rate: " + irPattern.format(interestRate);
	}

	//equals()
	public boolean equals(Investment r)
	{
       if(this.investorName.equals(r.investorName)&&this.investment==r.investment)
	       return true;
	    else
	       return false;
    }
	
	
}