/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteAnWei;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class DAORelato {

    public void insertar(TransferRelato tRelato) throws IOException {
       /* Se utilizan dos ficheros, uno para guardar informacion general y otro para el contenido del propio relato, para poder consultar mejor el .txt
                */ 
        
        File archivo = new File("relatos.txt");
		if(!archivo.exists()) 	archivo.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true)); //sin el parametro true borraba lo que habia antes en el txt
		if(archivo.exists()) {
			archivo.createNewFile();
			writer.write(tRelato.getId());
			writer.write(" ");
			writer.write(tRelato.getTitulo());
			writer.write(" ");
			writer.write(tRelato.getDirectorioRelato());
                        writer.write(" ");
			writer.write(tRelato.getIdUsuario());
			writer.newLine();
			
		}
		writer.close();
     /* para mejor eficiencia a la hora de leer los relatos, se guarda el contenido en otro fichero aparte,  en la carpeta /relatos/.....  esto se puede ver en el tranfer
     el transferRelato
                */
        File archivo2 = new File(tRelato.getDirectorioRelato());
		if(!archivo2.exists()) 	archivo2.createNewFile();
		BufferedWriter writer2 = new BufferedWriter(new FileWriter(archivo2, false)); // parametro false para borrar todo
		if(archivo2.exists()) {
			writer2.write(tRelato.getContenido());
			writer2.newLine();
			
		}
		writer2.close();        
                
    }

    public TransferRelato leerPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String generarSiguienteID() throws IOException{
        String idFinal = " ";
		 String relato;
		 String relatos[];
		 
		 File archivo = new File("relatos.txt");
			if(!archivo.exists()){
				archivo.createNewFile();
			}
			Scanner sc = new Scanner(archivo);
			
	     while(sc.hasNext()) {
	    	 relato = sc.nextLine();
	    	 relatos = relato.split(" ");
	    	 idFinal = relatos[0];	
	     }
	    sc.close();
	        
	    if(idFinal.equalsIgnoreCase(" ")) return "0";
	    else{
	    	   	int id = Integer.parseInt(idFinal) + 1;
	    	   	return Integer.toString(id);
	       	}
    }
    
}
