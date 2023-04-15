package bank_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/* JDBC connectivity
   1. Register the driver
   2. Create connection
   3. Create Statement
   4. Execute Query
   5. Close Connection
* */
public class conn {

    // Creating connection
    Connection c;
    Statement s;
    public conn(){
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            // Create Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");
            //Create statement
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }


}
