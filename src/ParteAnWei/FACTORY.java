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
public abstract class FACTORY {
    
    private static FACTORY instancia;
    
    public static FACTORY getInstance(){
		if(instancia == null) instancia = new FACTORY_IMP();
			return instancia;
	}
	
	public abstract DAOFan getDAOFan();
	/*
        aqui meted los DAOs que hayais creado, por ejemplo:
        public abstract DAOUsuario getDAOUsuario();
	public abstract DAOGasolina getDAOGasolina();
	public abstract DAOAlimento  getDAOAlimento();
	public abstract DAODescuento getDAODescuento();
        */
}
