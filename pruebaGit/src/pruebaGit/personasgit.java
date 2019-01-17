package pruebaGit;

public class personasgit {
	private String nombre;
	private int telefono;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "personasgit [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	

}
