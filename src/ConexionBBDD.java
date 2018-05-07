

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBBDD {
    

       private static final String NAME = "libro";
       private static final String DRIVER = "com.mysql.jdbc.Driver";
       private static final String SERVER =  "localhost";
       private static final String DATABASE = "jdbc:mysql://" + SERVER;
       private static final String PORT =  "3306";
       private static final String USER = "root";
       private static final String PASSWORD = "";
       
       
    public static Connection getConection(){
        try{
            Class.forName(DRIVER);
            Connection conection=DriverManager.getConnection(DATABASE+ ":" +PORT+"/"+NAME,USER,PASSWORD);
            return conection;
        }catch(ClassNotFoundException e){
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE,
            IErrors.ERROR_SQL_DRIVER, e);
        }catch (SQLException e) {
            Logger.getLogger(ConexionBBDD.class.getName()).log(Level.SEVERE,
                    IErrors.ERROR_SQL_OPEN_CONNECTION, e);
        }
        return null;
    }

}
