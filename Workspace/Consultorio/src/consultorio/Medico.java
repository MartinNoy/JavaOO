package consultorio;
import consultorio.Paciente;

public class Medico {
	private String Nombre;
	private String Apellido;
	private String Especialidad;
	public Medico(String nombre, String apellido, String especialidad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Especialidad = especialidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getEspecialidad() {
		return Especialidad;
	}
	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}
	public float calcularIMC(Paciente objetoPaciente) {
		float indice;
		indice = objetoPaciente.getPeso()/(objetoPaciente.getEstatura()*objetoPaciente.getEstatura());
		return indice;
	}

}
