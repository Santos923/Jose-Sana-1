/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jose.sana.pkg1;

/**
 *
 * @author 57314
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JoseSana1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "root";
        String clave = "";
        String url = "jdbc:mysql Workbench 8.0 ce://localhost:3306/";
        Connection conxion;
        Statement statement;
        ResultSet rs;
        try {
            // TODO code application logic here
            Class.forName("com-mysql-cj");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JoseSana1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Connection conexion = DriverManager.getConnection(url,nombre,clave);
            statement = conexion.createStatement();
            statement.executeUpdate("INSERT INTO CLIENTE(NOMBRE,CLAVE) VALUES(ABC,ACB123)");
            rs = statement.executeQuery("SELEC * FROM CLIENTE");
            rs.next();
            do {
                System.out.println(rs.getInt("userid")+ " : "+rs.getString("NOMBRE"));
            } while (rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(JoseSana1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            }
    
}
