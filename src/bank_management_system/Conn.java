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
public class Conn {

    // Creating connection
    Connection c;
    Statement s1;

    public Conn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Create Connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?characterEncoding=latin1", "root", "password");
            //Create statement

            s1 = c.createStatement();

            if (c != null) {
                System.out.println("success");
            }
        } catch (Exception e) {
            System.out.println("error occured");
            e.printStackTrace();
            //System.out.println(e);
        }

    }

}


