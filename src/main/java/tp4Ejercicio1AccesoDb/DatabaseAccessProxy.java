package tp4Ejercicio1AccesoDb;

import java.util.Collection;
import java.util.List;

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
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(this.login) {
			return this.databaseAccess.getSearchResults(queryString);
		}
		return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(this.login) {
			return this.databaseAccess.insertNewRow(rowData);
		}
		return 0;
	}
	
}
