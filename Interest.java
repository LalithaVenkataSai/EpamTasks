class Interest 
{
   
	 
public double calculateSimpleInterest(float principal_amount,float rate_of_interest,float time_period)
	{
		
    return (principal_amount*rate_of_interest*time_period)/100;
	
}

	   
public double calculateCompoundInterest(double principal_amount,double rate_of_interest,double time_period)
 
{
	 
return (principal_amount*(Math.pow(1+rate_of_interest/100,time_period)));
 
}

}
