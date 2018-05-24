/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteAnWei;

import java.io.IOException;

/**
 *
 * @author David
 */
public class SAFanImp implements SAFan{
    
    @Override
    public T_FAN getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addText(T_FAN tRelato) throws IOException {
        FACTORY fact = FACTORY.getInstance();
	DAOFan dao = fact.getDAOFan();
        
        T_FAN aux = dao.readForId(tRelato.getId());
        
        if(aux == null){    // si el texto no existe
            tRelato.setId(dao.generateNextId());
            dao.addText(tRelato);
            
        }
    }

    @Override
    public void editText(T_FAN tRelato) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteText(T_FAN tRelato) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void voteText(T_FAN tRelato) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void commentText(T_FAN tRelato) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void giveLikeText(T_FAN tRelato) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void voteChallenge(T_FAN tRelato) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
