package modelo;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Funciones {

public static int traerAnio(GregorianCalendar f){
	return f.get(Calendar.YEAR);
}

public static String traerFechaCorta(GregorianCalendar f) {
	String fechaCorta= f.get(Calendar.DAY_OF_MONTH)+"/"+f.get(Calendar.MONTH)+"/"+f.get(Calendar.YEAR);
	
	return fechaCorta;
}
	
}
