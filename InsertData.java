package electricity.billing.system;

import javax.swing.*;
import java.sql.*;
import java.sql.Connection;

class Conn {

    //Connection c;
    //Statement s;
    Conn() 
	{
        try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","kookie","Mani@123");
           //Statement s = c.createStatement();
            
		//s.close();
		con.close();
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
    }
}
class InsertData{

public static void main(String[] args){

Conn frame = new Conn();

}

}