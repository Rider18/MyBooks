/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administration;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author raulmadrid
 */
public class DAOAdministrationImp implements DAOAdministration{
    
    public TransferAdministration user;
    String user1;
    String pass;

    public DAOAdministrationImp() {
        this.user = new TransferAdministration("", "");
    }
    
    
    
    public void RequestData(){
        user.setId(LoginFrame.idTextField.getText());
        user.setPassword(LoginFrame.passTextField.getText());
    }
    
    public void RequestData(String _id, String _password){
       this.user.setId(_id);
       this.user.setPassword(_password);
    }
    
    public boolean Verify(){
        
         boolean exit = false;
            File file = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
               
               
               file = new File (PATH);
               fr = new FileReader (file);
               br = new BufferedReader(fr);

               // Lectura del fichero
               String line = "";
               String[] parts = null;

               // System.out.println(this.user + this.password);

               while((line=br.readLine())!=null){
                  parts = line.split("-");
                  if(parts[0].equals(user.getId()) && parts[1].equals(user.getPassword())){                      
                      exit = true;
                  }
               }     
            }
            catch(Exception e){
               e.printStackTrace();
            }finally{
               // En el finally cerramos el fichero, para asegurarnos
               // que se cierra tanto si todo va bien como si salta 
               // una excepcion.
               try{                    
                  if( null != fr ){   
                     fr.close();     
                  }                  
               }catch (Exception e2){ 
                  e2.printStackTrace();
               }
            }
            return exit;
    }
        
    public boolean LogIn(){
         if(Verify() != true){
            
                FileWriter fichero = null;
                PrintWriter pw = null;
                try
                {
                    fichero = new FileWriter(PATH, true);
                    pw = new PrintWriter(fichero);
                    pw.println(user.getId() + "-" + user.getPassword());

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                   try {
                   // Nuevamente aprovechamos el finally para 
                   // asegurarnos que se cierra el fichero.
                   if (null != fichero)
                      fichero.close();
                   } catch (Exception e2) {
                      e2.printStackTrace();
                   }
                }
                
                return true;
            }
            else{ 
                //System.err.println("ID registrado, pruebe con otro.");
                return false;}
        
    }

  
    
}
