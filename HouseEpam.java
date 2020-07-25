public class HouseEpam
{

   public void test () 
   {

    Construction c = new Construction();
		
    //Calculate cost using standard material
		
    double cost_using_standard_material = c.constructionCost("standard", 500, false);
		         //Calculate cost using above standard material
		
    double cost_using_above_standard_material = c.constructionCost("above standard", 500, false);
	    //Calculate cost using high standard material
		
    double cost_using_high_standard_material = c.constructionCost("high standard", 500, false);
		    //Calculate cost using high standard material and fully automated
		
  double cost_using_high_standard_material_automated = c.constructionCost("high standard", 500, true);
	  }


}