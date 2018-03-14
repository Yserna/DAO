package casoEstudio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ciudades {
	
	public static void main (String[] arg) {
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcasoEstudio","root","root");
		//PreparedStatement ps = con.prepareStatement("Select * From ciudades");
		PreparedStatement ps = con.prepareStatement("INSERT INTO ciudades(codigo,nombre,CodigoArea) VALUES('11', 'Sabaneta','4')");
		ps.execute();
		/*ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString("nombre"));
		}*/
		//rs.close();
		ps.close();
		con.close();
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage()+" No se encontro el driver de MySql de conexión");
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	
	}
		
}
