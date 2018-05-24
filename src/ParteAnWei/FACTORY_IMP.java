/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteAnWei;

/**
 *
 * @author David
 */
public class FACTORY_IMP extends FACTORY {


    @Override
    public DAOFan getDAOFan() {
        return new DAOFanImp();
    }
    
}
