package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Db_Koneksi2 {
      private static Connection conn;
      public static Connection getKoneksi( ){
                          String host       = "jdbc:mysql://localhost:3306/kkp",
                          user       = "root",
                          pass       = "";
               try{
                      conn = (Connection) DriverManager.getConnection(host, user, pass);
               }catch (SQLException err){
                       JOptionPane.showMessageDialog(null, err.getMessage( ) );
               }
               return conn;
      }
}
