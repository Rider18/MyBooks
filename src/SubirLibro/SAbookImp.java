/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubirLibro;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rider18
 */
public class SAbookImp implements SAbook{
    private BooksDAO DAO ;
    List<TransferBook> books ;
    
    @Override
    public List<TransferBook> allBooks() {
        books= new ArrayList<TransferBook>();
        DAO = new BookDaoImp();
       return DAO.allBooks();
    }
    public void addbooks(){
        
        
    }
}
