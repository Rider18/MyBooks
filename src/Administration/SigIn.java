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
public class SigIn {
    
    public SigIn(){
        
    }
    
    String user = "";
    String password = "";
    String path = "/Users/raulmadrid/NetBeansProjects/MyBooks/src/assets/usuario.txt";
    
    public void SigInData(){
        user = LoginSigin.user.getText();
        password = LoginSigin.password.getText();
    }
    
    public boolean SiginAction(){
            LogIn login = new LogIn();
            login.LogInData(user, password);
            
            if(login.LoginAction() != true){
            
                FileWriter fichero = null;
                PrintWriter pw = null;
                try
                {
                    fichero = new FileWriter(path, true);
                    pw = new PrintWriter(fichero);
                    pw.println(user + "-" + password);

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
