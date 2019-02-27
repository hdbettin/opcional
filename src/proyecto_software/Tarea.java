package proyecto_software;

public class Tarea {
	
	private final String descripcion;
	private final int duracion;
	private final Fases fase;
	
	public Tarea(String descripcion, int duracion, Fases fase){
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.fase = fase;
	}
	public Tarea(String descripcion, Fases fase){
		this.descripcion = descripcion;
		this.duracion = 10;
		this.fase = fase;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getDuracion() {
		return duracion;
	}
	public Fases getFase() {
		return fase;
	}
	
	

}
