package tp6Ejercicio1Logging;

import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class UpperCaseFormat extends SimpleFormatter {
	
	@Override
	public String format(LogRecord record) {
		return super.format(record).toUpperCase();
	}
}
