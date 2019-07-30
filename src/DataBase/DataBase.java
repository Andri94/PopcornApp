
package DataBase;

import java.sql.*;

public class DataBase {
    
    private Connection connection;
    private static DataBase instanca;
    
      public static Connection get(){
        if(instanca == null){
            instanca = new DataBase();
        }
        return instanca.connection;
    }
      
      public DataBase(){
        try{    
            String connString = "jdbc:mysql://localhost:3306/entertainment";
            String user = "root";
            String password = "";
            this.connection = DriverManager.getConnection(connString , user, password);
            System.out.println("Uspesna konekcija:");
       } catch(Exception e){
          System.err.println(e.toString());
          System.exit(1);
        }
    }
}
