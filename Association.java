/* 	Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos
 *  	Pedro Antonio Garcia Morales 15409
 *  	Diego Lopez 
 *  	Hoja de Trabajo 7. Binary Tree
*/

	/**
     * Clase Association
     */
public class Association<k,v> {

	/**
     * atributos para hacer la asociacion entre ingles y espanol 
     */
	private k ingles;
	private v espanol;
	
	public void setIngles(k string){
		ingles = string;
	}
	
	public void setEspanol(v cadena){	
		espanol = cadena;
	}
	
	public k getIngles(){	
		return ingles;
	}
	
	public v getEspanol(){	
		return espanol;
	}
}
