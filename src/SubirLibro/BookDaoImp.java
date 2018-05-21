package SubirLibro;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rider18
 */
public class BookDaoImp implements BooksDAO{
    private FileWriter write;
    private FileReader read;
    private String nombreArchivo= "libros.txt";
    private BufferedReader bufferReader;
    private BufferedWriter bufferedWriter;
    private PrintWriter out;

    @Override
    public List<TransferBook> allBooks() {
        List<TransferBook> books = new ArrayList<TransferBook>();
        TransferBook book = null;
        try {
            read = new FileReader(nombreArchivo);
            bufferReader = new BufferedReader(read);
            String line = bufferReader.readLine();
             line = line.trim();
            String [] partes = line.split("\\s+");
            book = new TransferBook(partes[0],partes[1] , partes[2], partes[3],partes[4], partes[5]);
            books.add(book);
            while (line != null) {
            line = bufferReader.readLine();
                if(line != null){
                    line = line.trim();
                    partes = line.split("\\s+");
                    book = new TransferBook(partes[0],partes[1] , partes[2], partes[3],partes[4], partes[5]);
                    books.add(book);
                }
            }
            bufferReader.close();
            read.close();
            
            
            return null;
        } catch (FileNotFoundException e) {
             Logger.getLogger(BookDaoImp.class.getName()).log(Level.SEVERE,
            IErrors.ERROR_OPEN_CONNECTION, e);
        } catch (IOException e) {
                      Logger.getLogger(BookDaoImp.class.getName()).log(Level.SEVERE,
            IErrors.ERROR_SETTING_CRITERIA, e);
        }
        return null;
    }

    @Override
    public void addBook(TransferBook book) {
        try {
            File file = new File("relatos.txt");
            if(!file.exists())
                file.createNewFile();
            
            BufferedWriter write = new BufferedWriter(new FileWriter(file, true)); 
            if(file.exists()) {
                //file.createNewFile();
                write.write(book.getTitle());
                write.newLine();
                write.write(book.getAuthor());
                write.newLine();
                write.write(book.getIsbn());
                write.newLine();
                write.write(book.getIdCliente());
                write.newLine();
                write.write(book.getEditorial());
                write.newLine();
                bufferedWriter.close();
                write.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(BookDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void createCliente(TransferBook cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCliente(TransferBook cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCliente(String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
