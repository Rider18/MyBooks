/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteAnWei;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class DAOFanImp extends DAOFan {

    public void addText(T_FAN tFan) throws IOException {
       /* Se utilizan dos ficheros, uno para guardar informacion general y otro para el contenido del propio relato, para poder consultar mejor el .txt
                */ 
        
        File archivo = new File("relatos.txt");
		if(!archivo.exists()) 	archivo.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true)); //sin el parametro true borraba lo que habia antes en el txt
		if(archivo.exists()) {
			archivo.createNewFile();
			writer.write(tFan.getId());
			writer.write(" ");
			writer.write(tFan.getDirectoryText());
                        writer.write(" ");
			writer.write(tFan.getIdUser());
			writer.newLine();
			
		}
		writer.close();
     /* para mejor eficiencia a la hora de leer los relatos, se guarda el contenido en otro fichero aparte,  en la carpeta /relatos/.....  esto se puede ver en el tranfer
     el transferRelato
                */
            File archivo2 = new File(tFan.getDirectoryText());
		if(!archivo2.exists()) 	archivo2.createNewFile();
		BufferedWriter writer2 = new BufferedWriter(new FileWriter(archivo2, false)); // parametro false para borrar todo
		if(archivo2.exists()) {
			writer2.write(tFan.getContent());
			writer2.newLine();
			
		}
		writer2.close();     
        
           
                
    }

    public T_FAN readForId(String id) throws FileNotFoundException, IOException {
        File archivo = new File("relatos.txt");
		if(!archivo.exists()) archivo.createNewFile();
		
		Scanner sc = new Scanner(archivo);
		String relato;
		String relatoArray[];
		T_FAN tFan = null;
		boolean encontrado = false, act;

		while (sc.hasNext() && !encontrado) {
			relato = sc.nextLine();
			relatoArray = relato.split(" ");
			if (relatoArray[0].equalsIgnoreCase(""+id)) {
				encontrado = true;
				tFan = new T_FAN(relatoArray[0], relatoArray[1], relatoArray[2]);
			}
		}
		sc.close();
		return tFan;
    }
    
    public String generateNextId() throws IOException{
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
