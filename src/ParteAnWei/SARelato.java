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
public class SARelato {
    
    /**
     *
     * @param tRelato
     * @return
     */
    public int crearRelato (TransferRelato tRelato) throws IOException{
        
        
        DAORelato dao = new DAORelato();
        
        TransferRelato aux = dao.leerPorId(tRelato.getId());
        
        if(aux == null){    // si el texto no existe
            tRelato.setId(dao.generarSiguienteID());
            dao.insertar(tRelato);
            return 1; // exito
        }
        else return 0; // fallo
    }
    
    
    
}
