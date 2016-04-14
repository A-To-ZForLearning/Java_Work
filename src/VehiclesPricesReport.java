/*
 * 
 * 
 * This is the vehicle report class
 * @author Nazar Al-Wattar
 * 
*/

    import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	
public class VehiclesPricesReport {


		private int vehicleID=0;
		private String engineType=null;
		private String vehicleType =null;
		private int vinNumber = 0;
		private String brand =null;
		private String color =null;
		private int price =0;
		private int year = 0;
		private double average = 0.0;
		private String query =null;
		
		/*
		 *Constructors 
		 */
		
		//default
		public VehiclesPricesReport()
		{}
		
		//parameterized Constructors
		public VehiclesPricesReport(int vehicleID)
		{
			this.vehicleID = vehicleID;
			
		}
		public VehiclesPricesReport(int vehicleID, String engineType ,String vehicleType, int vinNumber, String brand, String color, int price, int year)
		{
			this.vehicleID = vehicleID;
			this.engineType = engineType;
			this.vehicleType = vehicleType;
			this.vinNumber = vinNumber;
			this.brand =brand;
			this.color =color;
			this.price = price;
			this.year = year;
		}
		
			// accessors
		public int getvehicleID() {
			return this.vehicleID;
		}

		public String getengineType() {
			return this.engineType;
		}

		public String getvehicleType() {
			return this.vehicleType;
		}

		public int getvinNumber() {
			return this.vinNumber;
		}
				
		public String getbrand() {
			return this.brand;
		}
		public String getcolor() {
			return this.color;
		}
		
		public int getprice() {
			return this.price;
		}
		public int getyear() {
			return this.year;
		}
		public double getaverage() {
			return this.average;
		}
		// mutators
		public void setvehicleID(int vehicleID) {
			this.vehicleID = vehicleID;
		}

		public void setengineType(String engineType) {
			this.engineType = engineType;
		}

		public void setvehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}

		public void setvinNumber(int vinNumber) {
			this.vinNumber = vinNumber;
		}
		
		public void setbrand(String brand) {
			this.brand = brand;
		}

		public void setcolor(String color) {
			this.color = color;
		}

		public void setprice(int price) {
			this.price = price;
		}
		public void setyear(int year) {
			this.year = year;
		}
		public void setyear(double average) {
			this.average = average;
		}
		
		/*
		 *   Fetching Data Method
		 * 
		 */
		
		public void fetchAllInfoDependsOnPrice() throws SQLException, DLException
		{
				MySQLDatabase msdbco = new MySQLDatabase();
						
				try{
					if (msdbco.connect() == false)
					{
						System.out.println("We couldn't start connection with the database");
					}//end if
					
					else
					{
						System.out.println("\n          ----------------------All Vehiclees Information Report Depends On Price----------------------");
						
						ArrayList<ArrayList<String>> myreturn2Dlist ;
						query = ("Select enginetype.engineType , vehicleType.vehicleType,"+
						    " vehicle.vinNumber, vehiclebrand.brand , vehiclecolor.color , vehicle.price , vehicle.year "+
								"from vehicle JOIN vehiclebrand ON vehicle.vehicleBrandID = vehiclebrand.vehicleBrandID"+
						             " JOIN vehiclecolor ON vehicle.vehicleColorID =  vehiclecolor.vehicleColorID JOIN vehicletype"+
							            	" ON vehicle.vehicleTypeID = vehicletype.vehicleTypeID JOIN enginetype" +
						                        " ON vehicle.engineTypeID = enginetype.engineTypeID ORDER BY vehicle.price" + ";");
						
						myreturn2Dlist = msdbco.getData(query);
						if(myreturn2Dlist.isEmpty()){
							System.out.println("We didn't fetch data from the database, try again");
												
						}//end internal if
						else{
							
							System.out.println();
											
						
				        List<String> headersList = Arrays.asList("engineType", "vehicleType" ,"vinNumber","brand","color","price","year");
				        List<ArrayList<String>> rowsList2 =myreturn2Dlist;
				        Board board2 = new Board(190);
				        Table table = new Table(board2, 190, headersList, rowsList2);
				        Block tableBlock = table.tableToBlocks();
				        board2.setInitialBlock(tableBlock);
				        board2.build();
				        List<Integer> colWidthsListEdited = Arrays.asList(15, 10, 10, 15,10,10,10);
				        table.invalidate().setGridMode(Table.GRID_FULL).setColWidthsList(colWidthsListEdited);
				        String preview2 = board2.invalidate().setInitialBlock(table.tableToBlocks()).build().getPreview();
				        System.out.println(preview2);
				        
						}//end internal else
					try
					{
						//Close the connection to release the resources
						
						msdbco.close();
				
					}
					catch(Exception e) //catch closing connection exception
					{
						System.out.println("There is no connection to close it by fetch method");
						 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
					}
					
					}//End else
			
				}//end try
				catch(Exception e)    //catch connection error
				{
					System.out.println("There was a problem with the connection");
					throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
				}//end catch
		}// end fetch method
		
		
		public void fetchInfoDependsOnPriceTypeOnly() throws SQLException, DLException
		{
				MySQLDatabase msdbco = new MySQLDatabase();
						
				try{
					if (msdbco.connect() == false)
					{
						System.out.println("We couldn't start connection with the database");
					}//end if
					
					else
					{
						System.out.println("\n          ----------------------Vehiclees Type Report Depends On Price----------------------");
						
						ArrayList<ArrayList<String>> myreturn2Dlist ;
						query = ("Select vehicleType.vehicleType, vehicle.price "+
								"from vehicle JOIN vehicletype ON vehicle.vehicleTypeID = vehicletype.vehicleTypeID "+
								" ORDER BY vehicle.price;");
						
						myreturn2Dlist = msdbco.getData(query);
						if(myreturn2Dlist.isEmpty()){
							System.out.println("We didn't fetch data from the database, try again");
												
						}//end internal if
						else{
							List<String> headersList = Arrays.asList("vehicleType","price");
						    List<ArrayList<String>> rowsList2 =myreturn2Dlist;
							Board board2 = new Board(190);
							Table table = new Table(board2, 190, headersList, rowsList2);
							Block tableBlock = table.tableToBlocks();
							board2.setInitialBlock(tableBlock);
							board2.build();
							List<Integer> colWidthsListEdited = Arrays.asList(10, 10);
							table.invalidate().setGridMode(Table.GRID_FULL).setColWidthsList(colWidthsListEdited);
							String preview2 = board2.invalidate().setInitialBlock(table.tableToBlocks()).build().getPreview();
							System.out.println(preview2);
							
						}//end internal else					
								
				
					try
					{
						//Close the connection to release the resources
						
						msdbco.close();
				
					}
					catch(Exception e) //catch closing connection exception
					{
						System.out.println("There is no connection to close it by fetch method");
						 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
					}
					
					
					
					}//End else
				
							
				
				}//end try
				catch(Exception e)    //catch connection error
				{
					System.out.println("There was a problem with the connection");
					throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
				}//end catch
		}// end fetch
		

		public void fetchAverageCostPerBrandTypeSortedByPrice() throws SQLException, DLException
		{
				MySQLDatabase msdbco = new MySQLDatabase();
						
				try{
					if (msdbco.connect() == false)
					{
						System.out.println("We couldn't start connection with the database");
					}//end if
					
					else
					{
						System.out.println("\n          ----------------------Vehicles Average Brand Report Depends On Price----------------------");
						
						ArrayList<ArrayList<String>> myreturn2Dlist ;
						query = ("SELECT vehiclebrand.brand , CAST(avg(vehicle.price)AS DECIMAL(10,3)) "+
								" from vehicle	JOIN vehiclebrand ON vehicle.vehicleBrandID = vehiclebrand.vehicleBrandID"+
								" group by vehiclebrand.brand ORDER by vehicle.price;");
						
						myreturn2Dlist = msdbco.getData(query);
						if(myreturn2Dlist.isEmpty()){
							System.out.println("We didn't fetch data from the database, try again");
												
						}//end internal if
						else{
							List<String> headersList = Arrays.asList("vehicleID", "Vehicle Average by Brand");
						    List<ArrayList<String>> rowsList2 =myreturn2Dlist;
							Board board2 = new Board(190);
							Table table = new Table(board2, 190, headersList, rowsList2);
							Block tableBlock = table.tableToBlocks();
							board2.setInitialBlock(tableBlock);
							board2.build();
							List<Integer> colWidthsListEdited = Arrays.asList(20, 30);
							table.invalidate().setGridMode(Table.GRID_FULL).setColWidthsList(colWidthsListEdited);
							String preview2 = board2.invalidate().setInitialBlock(table.tableToBlocks()).build().getPreview();
							System.out.println(preview2);
							
						}//end internal else					
				
					try
					{
						//Close the connection to release the resources
						
						msdbco.close();
				
					}
					catch(Exception e) //catch closing connection exception
					{
						System.out.println("There is no connection to close it by fetch method");
						 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
					}
					
					}//End else
				
				
				}//end try
				catch(Exception e)    //catch connection error
				{
					System.out.println("There was a problem with the connection");
					throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
				}//end catch
		}// end fetch
		
		
		public void fetchAverageCostPerEngineTypeSortedByPrice() throws SQLException, DLException
		{
				MySQLDatabase msdbco = new MySQLDatabase();
						
				try{
					if (msdbco.connect() == false)
					{
						System.out.println("We couldn't start connection with the database");
					}//end if
					
					else
					{
						System.out.println("\n          ----------------------Vehicles Average Type Report Depends On Price----------------------");
						
						ArrayList<ArrayList<String>> myreturn2Dlist ;
						query = ("SELECT enginetype.engineType,"+
						   " CAST(avg(vehicle.price)AS DECIMAL(10,3))"+
						     " from vehicle JOIN enginetype ON vehicle.engineTypeID = enginetype.engineTypeID"+
						       " group by enginetype.engineType ORDER by vehicle.price;");
						
						myreturn2Dlist = msdbco.getData(query);
						if(myreturn2Dlist.isEmpty()){
							System.out.println("We didn't fetch data from the database, try again");
												
						}//end internal if
						else{
							List<String> headersList = Arrays.asList("vehicleID", "Vehicle Average by Type");
						    List<ArrayList<String>> rowsList2 =myreturn2Dlist;
							Board board2 = new Board(190);
							Table table = new Table(board2, 190, headersList, rowsList2);
							Block tableBlock = table.tableToBlocks();
							board2.setInitialBlock(tableBlock);
							board2.build();
							List<Integer> colWidthsListEdited = Arrays.asList(20, 30);
							table.invalidate().setGridMode(Table.GRID_FULL).setColWidthsList(colWidthsListEdited);
							String preview2 = board2.invalidate().setInitialBlock(table.tableToBlocks()).build().getPreview();
							System.out.println(preview2);
							
						}//end internal else					
								
				
			
					try
					{
						//Close the connection to release the resources
						
						msdbco.close();
				
					}
					catch(Exception e) //catch closing connection exception
					{
						System.out.println("There is no connection to close it by fetch method");
						 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
					}
					
					
					
					}//End else
				
					
				}//end try
				catch(Exception e)    //catch connection error
				{
					System.out.println("There was a problem with the connection");
					throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
				}//end catch
		}// end fetch
		
		
		
		public void fetchAverageCostPerColorSortedByPrice() throws SQLException, DLException
		{
				MySQLDatabase msdbco = new MySQLDatabase();
						
				try{
					if (msdbco.connect() == false)
					{
						System.out.println("We couldn't start connection with the database");
					}//end if
					
					else
					{
						System.out.println("\n          ----------------------Vehicles Average Color Report Depends On Price----------------------");
						
						ArrayList<ArrayList<String>> myreturn2Dlist ;
						query = ("SELECT vehiclecolor.color, CAST(avg(vehicle.price)AS DECIMAL(10,3))"+
                          " from vehicle JOIN vehiclecolor ON vehicle.vehicleColorID = vehiclecolor.vehicleColorID "+
                             " group by vehiclecolor.vehicleColorID ORDER by vehicle.price;");
						
						myreturn2Dlist = msdbco.getData(query);
						if(myreturn2Dlist.isEmpty()){
							System.out.println("We didn't fetch data from the database, try again");
												
						}//end internal if
						else{
							List<String> headersList = Arrays.asList("vehicleID", "Vehicle Average by Color");
						    List<ArrayList<String>> rowsList2 =myreturn2Dlist;
							Board board2 = new Board(190);
							Table table = new Table(board2, 190, headersList, rowsList2);
							Block tableBlock = table.tableToBlocks();
							board2.setInitialBlock(tableBlock);
							board2.build();
							List<Integer> colWidthsListEdited = Arrays.asList(20, 30);
							table.invalidate().setGridMode(Table.GRID_FULL).setColWidthsList(colWidthsListEdited);
							String preview2 = board2.invalidate().setInitialBlock(table.tableToBlocks()).build().getPreview();
							System.out.println(preview2);
							
						}//end internal else					
					
					try
					{
						//Close the connection to release the resources
						
						msdbco.close();
				
					}
					catch(Exception e) //catch closing connection exception
					{
						System.out.println("There is no connection to close it by fetch method");
						 throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
					}
					
										
					}//End else
											
				
				}//end try
				catch(Exception e)    //catch connection error
				{
					System.out.println("There was a problem with the connection");
					throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
				}//end catch
		}// end fetch
		
		/*  --------------------------- End Fetch Method-------------------------------------------*/	
			
	}// end of the class
