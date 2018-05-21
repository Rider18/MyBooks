package SubirLibro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cristian Bedoya
 */
public class TransferBook {
    private String title;
    private String isbn;
    private String author;
    private String editorial;
    private String idCliente;
   
    
    public TransferBook(String title,String isbn,String author,
    String editorial,String picture,String idCliente){
    this.isbn = isbn;
    this.author = author;
    this.editorial = editorial;
    this.idCliente = idCliente;
    }
    
    public void setTitle(String isbn){
        this.title = title;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public void setIsbn(String isbn){
        this.isbn = isbn;
    }
    
    public String getIsbn(){
        return this.isbn;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public void setEditorial(String editorial){
        this.editorial = editorial ;
    }
    
    public String getEditorial(){
        return this.editorial;
    }
    
    public void setIdCliente(String idCLiente){
        this.idCliente = idCliente ;
    }
    
    public String getIdCliente(){
        return this.idCliente;
    }

}
