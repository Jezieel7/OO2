package tp1Ejercicio2Biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonAdapterImpl implements JsonAdapter{

	private JSONObject cargarSocioAJSON(Socio socio) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", socio.getNombre());
		jsonObject.put("email", socio.getEmail());
		jsonObject.put("legajo", socio.getLegajo());
		return jsonObject;
	}

	@Override
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		JSONArray jsonArray = new JSONArray();
		socios.forEach(socio -> {
			jsonArray.add(this.cargarSocioAJSON(socio));
		});
		return jsonArray.toJSONString();
	}
	
}
