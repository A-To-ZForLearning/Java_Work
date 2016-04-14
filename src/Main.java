
/**
 *
 * @author Nazar Al-Wattar
 */
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, DLException 
	{

		//Main Method
		
		 VehiclesPricesReport myReport = new VehiclesPricesReport();
          myReport.fetchAllInfoDependsOnPrice();

	 System.out.println("\n");

	 //Call the method that will display all vehicles information depends on the price
	 try{
		 myReport.fetchInfoDependsOnPriceTypeOnly();

	     }catch(DLException e){
	    	 System.out.println("Look the Log file for more information");
		    	 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");	
	     }
	

	 System.out.println("\n");

	//Call the method that will display just the vehicle type and price vehicles information depends on the price
	 try{
		 myReport.fetchAverageCostPerBrandTypeSortedByPrice();
     	 }catch(DLException e){
     		 System.out.println("Look the Log file for more information");
     		 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");	
     	 }

	 System.out.println("\n");
	 try{
		 myReport.fetchAverageCostPerEngineTypeSortedByPrice();
     	 }catch(DLException e){
     		 System.out.println("Look the Log file for more information");
     		 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");	
     	 }

	 
	 System.out.println("\n");
	 try{
		 myReport.fetchAverageCostPerColorSortedByPrice();
	 }catch(DLException e){
		 System.out.println("Look the Log file for more information");
		 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");	
   	 }

	 
	//---------------------------End of Methods--------------------------
	System.out
	.println("-----------------------Bye Bye, See you later------------------------------");
		
		

		
	}//End Main Method

} //End Main Class
