import java.sql.*;
import java.util.*;

/**
 *
 * @author Nazar Al-Wattar
 */
/* This class contains the methods for connecting to the database, getting data from the database,
*
*/
public class MySQLDatabase { 
	
	//Database connector class
    private static final MySQLDatabase INSTANCE = new MySQLDatabase();
            
    public static Connection conn = null; //Connection object
    private String userName = "root"; //Database user name
    private String password = "root12345";        //Database password variable
    private String url = "jdbc:mysql://127.0.0.1/vehicles?autoReconnect=true&useSSL=false"; //Database url
    public boolean connection = false;
    public boolean closeVar = false;
   

 
    MySQLDatabase(){ 
	}
    
  //makes connection to database
    public boolean connect() throws DLException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver"); //sets driver 
        }
        catch(ClassNotFoundException e){
            throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Driver error in connect()");
        }
        
        try{
            conn = DriverManager.getConnection(url, userName, password); //creates Connection object
            connection = true;
        }
        catch(SQLException e){
            throw new DLException(e, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "URL=" + url, "Connection error in MySQLDatabase");
        }
        return connection;
    }
	
	//closes connection to database
    public boolean close()throws DLException {
        try{
            if(conn != null)   
               conn.close(); 
            closeVar = true;
         }
         catch(SQLException se){
            throw new DLException(se, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Error in close() of MySQLDatabase");
        }
        return closeVar;
    }
    
    //gets query results from database
    public ArrayList<ArrayList<String>> getData(String sql) throws DLException{
        try{
            Statement stmnt = conn.createStatement();
            ResultSet rs = stmnt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            
            ArrayList<ArrayList<String>> arry = new ArrayList<ArrayList<String>>();
            
            while(rs.next()){
                ArrayList<String> temp = new ArrayList<String>(numCols);
                for(int i = 1; i <=numCols; i++)
                { 
                	if(rs.getString(i).equals(""))
                	{
                		temp.add("UnSpecified");
                	
                	}
                	else
                	{
                		temp.add(rs.getString(i));
                	}
                }
                arry.add(temp);
            }
            return arry;
        }
        catch(SQLException|RuntimeException se){
            throw new DLException(se, "Unix time: " + String.valueOf(System.currentTimeMillis()/1000), "Error in getData() of MySQLDatabase", "SQL = "+ sql);
        }

    }
    
}