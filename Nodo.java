/* 	Universidad del Valle de Guatemala
 *  	Algoritmos y Estructura de Datos
 *  	Pedro Antonio Garcia Morales 		15409
 *  	Diego Lopez 				141222
 *  	Hoja de Trabajo 7. Binary Tree
*/

public class Nodo {
	
	/**
     * Atributos
     */
    Nodo izq;
    Nodo der;
    Association<String,String> datos=new Association<>();
  
    public Nodo(Association valorNodo){
        datos = valorNodo;
        izq = null;
        der = null; 
    }     
   
    /**
     * Metodo para insertar un nuevo nodo
     */
    public  void InsNueNode(Association<String,String> InsValor) {
        
        String word = InsValor.getIngles();
        //insertar en subarbol izquierdo
        if(word.compareTo(datos.getIngles())<0){
            if(izq == null){
                izq = new Nodo(InsValor);} 
            else    
                izq.InsNueNode(InsValor);
        }
        if(word.compareTo(datos.getIngles())>0){
            if(der == null){
                
                der = new Nodo(InsValor);
            }
            else
                der.InsNueNode(InsValor);
        }
    }
}
