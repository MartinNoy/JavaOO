package test;
import consultorio.*;
public class TestConsultorio {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("Jose","Perez",1.80f,85);
		Paciente paciente2 = new Paciente("Martin","Noy",1.75f,60);
		Medico medico1 = new Medico("Gerardo","Ferre","Gastroenterologo");
		System.out.println("hola mundo");
		System.out.println(paciente1.traerNombreCompleto());
		System.out.println(paciente2.traerNombreCompleto());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(medico1.calcularIMC(paciente1));
	}

}
