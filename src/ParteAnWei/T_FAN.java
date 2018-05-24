/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteAnWei;

/**
 *
 * @author David
 */
public class T_FAN {
    private String id;
    private String title;
    private String content;
    private String directoryText;
    private String IdUser;
    
    public T_FAN(){
    this.id = "";
    this.title = "";
    this.directoryText = "";
    this.content = "";
    this.IdUser = "";
    }
    
    public T_FAN(String id, String title, String content ,String IdUser){
    this.id = id;
    this.title = title;
    this.content = content;
    this.directoryText = "relatos/" + title + ".txt";
    this.IdUser = IdUser;
    }
    
     public T_FAN(String id, String title ,String IdUser){
    this.id = id;
    this.title = title;
    this.directoryText = "relatos/" + title + ".txt";
    this.IdUser = IdUser;
    }
    
    public String getId(){
    return this.id;
    }
    
    public void setId(String id){
    this.id = id;
    }
    
    public String getTitle(){
    return this.title;
    }
    
    public void setTitle(String title){
    this.title = title;
    }
    
    public String getContent(){
    return this.content;
    }
    
    public void setContent(String content){
    this.content = content;
    }
    
    public String getDirectoryText(){
    return this.directoryText;
    }
    
    public void setDirectoryText(String directoryText){
    this.directoryText = directoryText;
    }
    
    public String getIdUser(){
    return this.IdUser;
    }
    
    public void setIdUser(String IdUser){
    this.IdUser = IdUser;
    }
    
}
