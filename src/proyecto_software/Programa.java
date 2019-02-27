package proyecto_software;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tarea extraccion  = new Tarea("Extraccion de requisitos", 12, Fases.ANALISIS);
		Tarea definicion = new Tarea("Definicion de casos de uso", 6, Fases.ANALISIS);
		Tarea diseño = new Tarea("Diseño de modelo de datos", 10, Fases.DISEÑO);
		Tarea implementacion_ui = new Tarea("Implementacion de la ui", 20, Fases.IMPLEMENTACION);
		Tarea implementacion_modelo = new Tarea("Implementacion del modelo", 20, Fases.IMPLEMENTACION);
		Tarea implementacion_pruebas = new Tarea("Implementacion de las pruebas", 8, Fases.IMPLEMENTACION);
		Tarea configuracion = new Tarea("Configuracion de la base de datos", 4, Fases.DESPLIEGUE);
		Tarea instalacion = new Tarea("Instalacion del servidor", 6, Fases.DESPLIEGUE);
		Tarea mantenimiento = new Tarea("programacion nuevos requisitos", 20, Fases.MANTENIMIENTO);
		
		
		Proyecto_software proyecto = new Proyecto_software("Proyecto 1", 
				extraccion, definicion, diseño, implementacion_ui, implementacion_modelo, 
				implementacion_pruebas, configuracion, instalacion, mantenimiento);
		
		for(int i=0; i<proyecto.getTareas().size(); i++){
			if(proyecto.getTareas().get(i).getDuracion() < 7){
				proyecto.borrar_tarea(proyecto.getTareas().get(i));
			}
		}
		
		for(int i=0; i<proyecto.getTareas().size(); i++){
			if(proyecto.getTareas().get(i).getFase() == Fases.ANALISIS){
				proyecto.finalizar_tarea(proyecto.getTareas().get(i));
			}
		}
		
		
		System.out.println("el nombre del proyecto es: " + proyecto.getNombre());
		System.out.println("sus tareas son: ");
		proyecto.imprimir_tareas();
		System.out.println("tiene una duracion de: " + proyecto.getDuracion());
		System.out.println("sus tareas finalizadas son: ");
		proyecto.imprimir_tareas_finalizadas();
	}

}
