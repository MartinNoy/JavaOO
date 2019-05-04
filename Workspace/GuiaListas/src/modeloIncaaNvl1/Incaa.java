package modeloIncaaNvl1;
import java.util.ArrayList;
import java.util.List;

public class Incaa {
	
	private List<Pelicula> catalogo = new ArrayList<Pelicula>();

	public Incaa(List<Pelicula> catalogo) {
		super();
		this.catalogo = catalogo;
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	public boolean agregarPelicula(String pelicula) {
		 catalogo.add(pelicula);
		
		return true;
	}
	
}

