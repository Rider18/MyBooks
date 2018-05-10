/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administration;

import Administration.LoginSigin;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author raulmadrid
 */
public class LogIn {
    
    public LogIn(){
        
    }
    
    String user = "";
    String password = "";
    String path = "/Users/raulmadrid/NetBeansProjects/MyBooks/src/assets/usuario.txt";
    
    public void LogInData(){
        user = LoginSigin.user.getText();
        password = LoginSigin.password.getText();
    }
    
    public void LogInData(String _user, String _password){
        user = _user;
        password = _password;
    }
    
    public boolean LoginAction(){
            boolean exit = false;
            File file = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
               // Apertura del fichero y creacion de BufferedReader para poder
               // hacer una lectura comoda (disponer del metodo readLine()).
               file = new File (path);
               fr = new FileReader (file);
               br = new BufferedReader(fr);

               // Lectura del fichero
               String line = "";
               String[] parts = null;

               // System.out.println(this.user + this.password);

               while((line=br.readLine())!=null){
                  parts = line.split("-");
                  if(parts[0].equals(user) && parts[1].equals(password)){
                      //System.out.println("WORKS!");
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
    
    
}
