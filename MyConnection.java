
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MyConnection {
    
    
    public static Connection connect()
    {  
        Connection con=null;
         try{
             
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/couriersystem","root","root");
             
             Component rootPane=null;
             System.out.println("Connected");
             
             
         }catch(Exception ex)
         {
             JOptionPane.showMessageDialog(null,ex);
         }
         return con;
    }
    
}
