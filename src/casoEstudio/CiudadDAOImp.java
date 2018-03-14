package casoEstudio;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CiudadDAOImp implements CiudadDAO {

	@Override
	public void insertar(Ciudad ciudad) throws ExceptionClass {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Ciudad ciudad) throws ExceptionClass {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Ciudad ciudad) throws ExceptionClass {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Ciudad> obtener() throws ExceptionClass {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Ciudad> ciudades = new ArrayList<Ciudad>();
		DataSource ds = new DataSource();
		try {
			con = ds.getConnection();
			ps = (PreparedStatement) con.prepareStatement("Select * from ciudades");
			rs = ps.executeQuery();
			while(rs.next()) {
				Ciudad ciudad = new Ciudad();
				ciudad.setCodigo(rs.getInt("Codigo"));
				ciudad.setNombre(rs.getString("Nombre"));
				ciudades.add(ciudad);
			}
			rs.close();
			ps.close();
			con.close();
		} catch(SQLException e){
			throw new ExceptionClass("Error");
		}		
		return null;
	}

}
