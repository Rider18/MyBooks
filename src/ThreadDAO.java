/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.List;

public interface ThreadDAO {
    public List<TransferThread> readThread();
    public void createThread(TransferThread Thread);
    public void updateThread(TransferThread Thread);
    public void deleteThread();
}
