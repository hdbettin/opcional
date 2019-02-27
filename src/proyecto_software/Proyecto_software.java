package proyecto_software;

import java.util.ArrayList;

public class Proyecto_software {
	
	private String nombre;
	private ArrayList<Tarea> tareas = new ArrayList<Tarea>();
	private ArrayList<Tarea> tareas_finalizadas = new ArrayList<Tarea>();
	private int duracion;
	
	public Proyecto_software(String nombre, Tarea...tareas){
		this.nombre = nombre;
		for(Tarea tarea : tareas){
			this.tareas.add(tarea);
			this.duracion += tarea.getDuracion();
		}
	}
	
	public ArrayList<Tarea> consultar_lista(Fases fase){
		ArrayList<Tarea> retorno_tareas = new ArrayList<>();
		for(Tarea tarea: this.tareas){
			if(tarea.getFase() == fase){
				retorno_tareas.add(tarea);
			}
		}
		return retorno_tareas;
	}
	
	public Tarea añadir_tarea(String nombre, Fases fase, int duracion){
		Tarea tarea_nueva = new Tarea(nombre, duracion, fase);
		
		this.tareas.add(tarea_nueva);
		
		return tarea_nueva;
	}
	
	public boolean borrar_tarea(Tarea tarea){
		boolean retorno = false;
		if(this.tareas.contains(tarea)){
			this.tareas.remove(tarea);
			retorno = true;
		}
		
		return retorno;
	}
	
	public boolean finalizar_tarea(Tarea tarea_finalizada){
		boolean retorno =  false;
		
		if(this.tareas.contains(tarea_finalizada)){
			if(!this.tareas_finalizadas.contains(tarea_finalizada)){
				this.tareas.remove(tarea_finalizada);
				this.tareas_finalizadas.add(tarea_finalizada);
				retorno = true;
			}
		}
		
		
		return retorno;
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public ArrayList<Tarea> getTareas_finalizadas() {
		return tareas_finalizadas;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public void imprimir_tareas(){
		for(Tarea tarea : this.tareas){
			System.out.print("["+tarea.getDescripcion()+"] ");
		}
	}
	public void imprimir_tareas_finalizadas(){
		for(Tarea tarea : this.tareas_finalizadas){
			System.out.print("["+tarea.getDescripcion()+"] ");
		}
	}
	
	
	
	
}
