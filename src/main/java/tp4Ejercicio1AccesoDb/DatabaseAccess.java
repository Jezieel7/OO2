package tp4Ejercicio1AccesoDb;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	   /**
	    * Retorna una colección de acuerdo al texto que posee "queryString"
	    * @param queryString
	    * @return
	    */
    Collection<String> getSearchResults(String queryString);

    /**
     * Realiza la inserción de nueva información en la base de datos y 
     * retorna el id que recibe la nueva inserción
     *
     * @param rowData
     * @return
     */
    int insertNewRow(List<String> rowData);
}