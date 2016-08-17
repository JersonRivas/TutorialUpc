package pe.edu.upc.Entity;

public class Mermelada extends Fruta { //extends es como :: c++ Herencia

	private int duracionDias;
	private String tipoEnvase;
	
	public String prepararMermelada()
	{
		return ("Preparando mermelada con alegria:"+this.getNombre());
		
	}

	public Mermelada(String nombre, String color, String sabor, int duracionDias,String tipoEnvase) {
		super(nombre, color, sabor);
		this.duracionDias=duracionDias;
		this.tipoEnvase=tipoEnvase;
		// TODO Auto-generated constructor stub
	}
}
