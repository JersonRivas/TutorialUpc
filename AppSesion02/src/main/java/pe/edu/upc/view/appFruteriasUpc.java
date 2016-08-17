package pe.edu.upc.view;

import pe.edu.upc.Entity.Fruta;

public class appFruteriasUpc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Fruta objFruta = new Fruta("Mango", "Amarillo", "Dulce");
				//clase concreta es aquella clase que puedes crear objetos de esa clase
				//Clase abstracta no se puede crear objetos de esa clase pero si los puedes declarar
	
	System.out.println(objFruta.toString());
	
	Fruta.LugarOrigen = "Otro Lugar";
	System.out.println(Fruta.LugarOrigen);
	
	}

}
