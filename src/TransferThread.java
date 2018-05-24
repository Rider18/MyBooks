
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Casa
 */
public class TransferThread {
    private String title; //titulo del tema nuevo
    private String text; //texto del tema
    private String author; //Autor del tema
    private String date; //fecha del tema
    private List<TransferComment> comments; // numero de comentarios del tema
    
    public TransferThread(String _title, String _text, String _author, String _date){
        this.title = _title;
        this.text = _text;
        this.author = _author;
        this.date = _date;
        this.comments = new ArrayList<TransferComment>();
    }
    
    public String getTitle(){
        return this.title;
    }
    public String getText(){
        return this.text;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getDate(){
        return this.date;
    }
    public List<TransferComment> getComments(){
         return this.comments;
    }
     
    public void setTitle(String _title){
        this.title = _title;
    } 
    public void setText(String _text){
        this.text = _text;
    }
    public void setAuthor (String _author){
        this.author = _author;
    }
    public void setDate(String _date){
        this.date = _date;
    }
    
}
