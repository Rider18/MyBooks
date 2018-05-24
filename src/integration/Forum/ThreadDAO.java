package integration.Forum;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import business.Forum.TransferComment;
import business.Forum.TransferThread;
import java.io.IOException;
import java.util.List;

public interface ThreadDAO {
    public TransferThread readThread(String id) throws IOException;
    public void createThread(TransferThread Thread) throws IOException;
    public void updateThread(TransferThread Thread, TransferComment comment) throws IOException;
    public void deleteThread(TransferThread Thread) throws IOException;
}
