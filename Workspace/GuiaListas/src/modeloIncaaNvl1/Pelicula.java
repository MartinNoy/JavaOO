package modeloIncaaNvl1;

public class Pelicula {
	private int idPelicula;
	private String peliula;
	public Pelicula(int idPelicula, String peliula) {
		super();
		this.idPelicula = idPelicula;
		this.peliula = peliula;
	}
	public int getIdPelicula() {
		return idPelicula;
	}
	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}
	public String getPeliula() {
		return peliula;
	}
	public void setPeliula(String peliula) {
		this.peliula = peliula;
	}
	

}
