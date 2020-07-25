class CalculateInterests 
 
{

     public void test()
 
    {
         
      Interest i=new Interest();
 
      //calculate simple interest
         
      double s_i=i.calculateSimpleInterest(2000,6,2);
   
     //calculate compound interest
            
     double c_i=i.calculateCompoundInterest(2000,6,2);
        
         
     
    }
 
}