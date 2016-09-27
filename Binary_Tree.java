/* 	Universidad del Valle de Guatemala
 *  	Algoritmos y Estructura de Datos
 *  	Pedro Antonio Garcia Morales 	15409
 *  	Diego Lopez 			141222
 *  	Hoja de Trabajo 7. Binary Tree
*/

public class Binary_Tree<E> {
    
     //Variables
     private Nodo node;
     private String string;
     private String btree;
 
    //Constructor
    public  void addNodo(Association<String,String> valueAdd){
        if(node == null){
            node = new Nodo(valueAdd);
        }
        else{
            node.InsNueNode(valueAdd);  
        }  
    }

    //Método que busca las palabras para traducir
    public String Buscar(String cadena){
        string = cadena;
        B_Help(node);
        return string;   
       }
    
   //Método que ayuda a buscar las palabras de ingles a español en el diccionario 
   public void B_Help(Nodo nodo){
       if(nodo == null) {
    	   return  ;
       }
       B_Help(nodo.izq);
       if(nodo.datos.getIngles().equals(string)){
    	   string = nodo.datos.getEspanol();
       } 
       if(nodo.datos.getEspanol().equals(string)){
    	   return    ;
       }
       B_Help(nodo.der);
   }     
    

}


