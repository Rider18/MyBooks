/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administration;

/**
 *
 * @author raulmadrid
 */
public class TransferAdministration {
    
    private String id;
    private String password;
    
    public TransferAdministration(String _id, String _password){
        this.id = _id;
        this.password = _password;
    }

    public String getId() {
        return id;
    }
    
    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
  
    
}
