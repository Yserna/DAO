package casoEstudio;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DataSource {
	private String url = "jdbc:mysql://localhost:3306/dbcasoEstudio";
	private String username = "root";
	private String password = "root";
	
	public Connection getConnection() throws ExceptionClass{
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, username, password);			
		} catch(ClassNotFoundException e){
			throw new ExceptionClass("No ha encontrado: " +e);
		}catch(SQLException e){
			throw new ExceptionClass("Ha ocurrido un error al conectar la bd: " +e);
		}
		return con;
	}
	
}
