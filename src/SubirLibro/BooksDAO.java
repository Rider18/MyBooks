package SubirLibro;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rider18
 */
public interface BooksDAO {
    public List<TransferBook> allBooks();
    public void addBook(TransferBook book);
    public void createCliente(TransferBook cliente);
    public void updateCliente(TransferBook cliente);
    public void deleteCliente(String valor);
}
