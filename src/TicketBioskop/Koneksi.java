package TicketBioskop;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
Connection kon;
    public Connection KoneksiDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            kon= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/demofam","root","");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
    }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
    }
    return kon;  
    }
    

}
