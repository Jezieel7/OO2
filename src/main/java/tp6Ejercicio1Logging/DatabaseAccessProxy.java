package tp6Ejercicio1Logging;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class DatabaseAccessProxy implements DatabaseAccess {
	private DatabaseAccess databaseAccess;
	private static String password = "p455w0rD";
	private boolean login;
	
	public DatabaseAccessProxy(DatabaseAccess databaseAccess, String password) {
		if(DatabaseAccessProxy.password.equals(password)) {
			this.databaseAccess = databaseAccess;
		}
		this.login = false;
	}
	
	public void login(String password) {
		if(DatabaseAccessProxy.password.equals(password)) {
			this.login = true;
		}
		Logger.getLogger("DatabaseAccessProxy").log(Level.SEVERE, "Acceso inválido a la base de datos");
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.login) {
			Logger.getLogger("DatabaseAccessProxy").log(Level.INFO, "Acceso válido para búsquedas");
			return this.databaseAccess.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.login) {
			Logger.getLogger("DatabaseAccessProxy").log(Level.WARNING, "Acceso válido para inserciones");
			return this.databaseAccess.insertNewRow(rowData);
		}
		return 0;
	}
	
}
