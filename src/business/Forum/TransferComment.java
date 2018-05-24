package business.Forum;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Casa
 */
public class TransferComment {
    private String text; //texto del mensaje
    private String author; //autor del mensaje
    private String date; //fecha del mensaje
    
    public TransferComment(String _text, String _author, String _date){
       this.text = _text;
       this.author = _author;
       this.date = _date;
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
