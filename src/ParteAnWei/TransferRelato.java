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
public class TransferRelato {
    private String id;
    private String titulo;
    private String contenido;
    private String directorioRelato;
    private String IdUsuario;
    
    public TransferRelato(){
    this.id = "";
    this.titulo = "";
    this.directorioRelato = "";
    this.contenido = "";
    this.IdUsuario = "";
    }
    
    public TransferRelato(String id, String titulo, String contenido, String IdUsuario){
    this.id = id;
    this.titulo = titulo;
    this.contenido = contenido;
    this.directorioRelato = "/relatos/" + titulo + ".txt";
    this.IdUsuario = IdUsuario;
    }
    
    public String getId(){
    return this.id;
    }
    
    public void setId(String id){
    this.id = id;
    }
    
    public String getTitulo(){
    return this.titulo;
    }
    
    public void setTitulo(String titulo){
    this.titulo = titulo;
    }
    
    public String getContenido(){
    return this.contenido;
    }
    
    public void setContenido(String contenido){
    this.contenido = contenido;
    }
    
    public String getDirectorioRelato(){
    return this.directorioRelato;
    }
    
    public void setDirectorioRelato(String directorioRelato){
    this.directorioRelato = directorioRelato;
    }
    
    public String getIdUsuario(){
    return this.IdUsuario;
    }
    
    public void setIdUsuario(String IdUsuario){
    this.IdUsuario = IdUsuario;
    }
    
}
