/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Forum;

import java.io.IOException;

/**
 *
 * @author 
 */
public interface SAForum {
        public abstract int newThread(TransferThread thread)throws IOException;
	public abstract int newComment(String ID, TransferComment comment)throws IOException;
}
