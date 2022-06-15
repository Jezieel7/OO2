package tp1Ejercicio2Biblioteca;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonAdapter implements JsonAdapter {
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		ObjectMapper mapper = new ObjectMapper();
		String separator = System.lineSeparator();
		StringBuilder jsonString = new StringBuilder("[" + separator);
		socios.forEach(socio -> {
			try {
				jsonString.append(mapper.writeValueAsString(socio));
				jsonString.append(",");
				jsonString.append(separator);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
		jsonString.setLength(jsonString.length() - (separator.length() + 1));
		jsonString.append("]");
		return jsonString.toString();
	}
}
