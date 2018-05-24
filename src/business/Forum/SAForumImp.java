/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Forum;

import integration.Forum.ThreadDAO;
import integration.Forum.ThreadDAOImp;
import java.io.IOException;

/**
 *
 * @author Ángela
 */
public class SAForumImp implements SAForum{
    @Override
    public int newThread(TransferThread thread) throws IOException{
        int hecho = -1;
        ThreadDAO threadDao = new ThreadDAOImp();
        if (thread!=null){ //acceso al DAO
            TransferThread esta= threadDao.readThread(thread.getID());
            if (esta==null){
                threadDao.createThread(thread);
                hecho=1;
            }
        }
        //Si devuelve -1, ya existia el hilo
        return hecho;
    }

    @Override
    public int newComment(String ID, TransferComment comment) throws IOException{
        int hecho = -1;
        
        ThreadDAO threadDao = new ThreadDAOImp();
        if (ID!=null && comment !=null){ //acceso al DAO
            TransferThread esta= threadDao.readThread(ID);
            if (esta!=null){
                threadDao.updateThread(esta, comment);
                hecho=1;
            }
        }
        //Si devuelve -1, no existe el hilo donde comentar
        return hecho;    }


    
}
