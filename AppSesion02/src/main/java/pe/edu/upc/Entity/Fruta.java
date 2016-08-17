package pe.edu.upc.Entity;

public class Fruta {
    //Atributos de Instancia
	private String nombre;
	private String color;				//estos 4 se llaman atributos de instancia porque van a cambiar
	private String sabor; 				//por cada fruta que tengan
	private boolean puedoHacerJugo;
	
	//Atributos de clase
	public static String LugarOrigen ="Upc"; //se pone static si depende directamente de la clase

	
	public Fruta ()					//ESTO SE LLAMA SOBRECARGA
	{
		this.nombre = "Indefinido";  
		this.color = "S/C";    
		this.sabor = "S/C";
		this.puedoHacerJugo = false;
		
	}
	//El constructor tiene que tener el mismo nombre de la clase
	
	public Fruta(String nombre, String color, String sabor) {
		super(); //palabras reservadas Heredar constructor Clase Padre
		this.nombre = nombre;  //this hereda y hace referencia a la misma clase y hacer referencia
		this.color = color;    //hacer atributos y instancias dentro de la misma clase
		this.sabor = sabor;
		this.puedoHacerJugo = false;
	}

	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isPuedoHacerJugo() {
		return puedoHacerJugo;
	}

	public void setPuedoHacerJugo(boolean puedoHacerJugo) {
		this.puedoHacerJugo = puedoHacerJugo;
	}

	@Override //Es sobreescritura
	public String toString() {
		return "Fruta [nombre=" + nombre + ", color=" + color + ", sabor=" + sabor + ", puedoHacerJugo="
				+ puedoHacerJugo + "]";
	}
	
}
