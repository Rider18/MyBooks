/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteAnWei;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public abstract class DAOFan {

    public abstract void addText(T_FAN tFan) throws IOException;

    public abstract T_FAN readForId(String id) throws FileNotFoundException, IOException;
    
    public abstract String generateNextId() throws IOException;
    
}
