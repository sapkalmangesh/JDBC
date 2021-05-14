//ConTest.java
package jdbcApp;
import java.sql.Connection;
import java.sql.DriverManager;

import oracle.jdbc.driver.OracleDriver;
public class ConnTest {
	public static void main(String[] args) throws Exception
	{
		
	
	// Register jdbc driver- creating jdbc driver object
	
	OracleDriver obj = new OracleDriver();
	
	
	//register oracle jdbc driver obj with DriverManager Service
	
	DriverManager.registerDriver(obj);
	// Eststablish the connection
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "12345");
	
	con=null;
	
	if(con==null)
		System.out.println("Connection is not Establish");
		else
			System.out.println("Connection is Establish");
	}
}
