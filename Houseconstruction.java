import java.lang.*;

import java.util.*;

class  Houseconstruction 

{
     
	public static String materialStandard;
     
	public static double houseArea;
     
	public static double houseConstructionCost(String materialStandard1,double houseArea )
     
	{
        
		double ans=0;
        
		switch(materialStandard1)
        
		{
            
			case "standardmaterials":ans= 1200*houseArea;
            
			break;
            
			case "aboveStandardMaterials":ans= 1500*houseArea;
           
 			break;
             
			case "highStandardMaterial":ans= 1800*houseArea;
            
			break;
             
			case "fullyAutomatedHome":ans= 2500*houseArea;
            
			break;
            
			default:System.exit(0);
        
		}
        
		return ans;
     
	}
     
	public static void testing()     
	{
         
		Scanner scan=new Scanner(System.in);
         
		materialStandard=scan.next();
         
		houseArea=scan.nextDouble();
         
		houseConstructionCost(materialStandard,houseArea);
     
	}

}