package casoEstudio;

import java.util.List;

public interface CiudadDAO {
	
	public void insertar(Ciudad ciudad) throws ExceptionClass;	
	public void actualizar(Ciudad ciudad) throws ExceptionClass;	
	public void eliminar(Ciudad ciudad) throws ExceptionClass;	
	public List<Ciudad> obtener() throws ExceptionClass;
}
