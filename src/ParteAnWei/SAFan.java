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
public interface SAFan {
    
public abstract T_FAN getText( );

public abstract void addText(T_FAN tRelato) throws IOException;

public abstract void editText(T_FAN tRelato) throws IOException;

public abstract void deleteText(T_FAN tRelato) throws IOException;

public abstract void  voteText(T_FAN tRelato) throws IOException;

public abstract void commentText(T_FAN tRelato) throws IOException;

public abstract void giveLikeText(T_FAN tRelato) throws IOException;

public abstract void voteChallenge(T_FAN tRelato) throws IOException;
	   
}
