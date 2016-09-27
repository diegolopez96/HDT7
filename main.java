/* 	Universidad del Valle de Guatemala
 *  Algoritmos y Estructura de Datos
 *  	Pedro Antonio Garcia Morales 15409
 *  	Diego Lopez 
 *  	Hoja de Trabajo 7. Binary Tree
*/

import java.io.*;
import java.util.*;

/**
 *
 *
 *  
 */

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan;
        Binary_Tree tree = new Binary_Tree();
        scan = new Scanner (System.in);
        String traduccion = " ";
        
        try{
            FileInputStream doc = new FileInputStream("C:\\Users\\usuario1\\Desktop\\Nueva carpeta\\HDT7\\src\\texto.txt");
            DataInputStream ent = new DataInputStream(doc);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(ent));
            String strLinea;
         
            while ((strLinea = buffer.readLine()) != null)   {
                traduccion = traduccion+strLinea+" ";
            }
            ent.close();
        }
        catch (Exception e){ 
            System.out.println("No se puede leer el documento" + e.getMessage());
        }
        
        List<String> palabras = new ArrayList<>();
        int countLineas = 0;
        
        try{
            FileInputStream doc2 = new FileInputStream("C:\\Users\\usuario1\\Desktop\\Nueva carpeta\\HDT7\\src\\diccionario.txt");
            DataInputStream ent2 = new DataInputStream(doc2);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(ent2));
            String strLinea;
            
            while ((strLinea = buffer.readLine()) != null)   {
                palabras.add(strLinea);
                countLineas = countLineas+1;
            }
            ent2.close();
        }
        catch (Exception e){ //Catch de excepciones
            System.out.println("No se puede leer el documento" + e.getMessage());
        }
        
        for(int i = 0; i < countLineas; i++ )
        {   Association<String,String> valor = new Association<>();
            String linea1;
            int coma = 0;
            linea1 = palabras.get(i).toLowerCase();
            for(int n = 0; n <linea1.length()-1; n++){
                    if(Character.toString(linea1.charAt(n)).equals(",")){
                        coma = n;
                    }
                 }
            valor.setIngles(linea1.substring(0,coma));
            valor.setEspanol(linea1.substring(coma+1,linea1.length()));
            tree.addNodo(valor);
        }
        
        int inicio = 0;
        int N_Palabras = 0;
        List<String> Texto = new ArrayList<>();
             for(int n = 0; n <traduccion.length(); n++){
                    if(Character.toString(traduccion.charAt(n)).equals(" ")){
                        Texto.add(traduccion.substring(inicio, n));
                        inicio = n;
                        N_Palabras = N_Palabras+1;
                        
                    }
                 }
        

        String word = " ";
        for(int n = 0; n<N_Palabras; n++){
          	 String palabra1 = tree.Buscar(Texto.get(n).replace(" ",""));
             String palabra2 = Texto.get(n).replace(" ","");
             if(palabra1.equals(palabra2)){
                 word = word+"*"+Texto.get(n).replace(" ","")+"*";  
             }
             else{
                 word = word+tree.Buscar(Texto.get(n).replace(" ","")); 
             }
        }
        
        System.out.println(); 
        System.out.println("El texto ingresado es: ");
        System.out.println(traduccion);
        System.out.println("El texto traducido es: ");
        System.out.println(word);
        
       
    }
    
}
