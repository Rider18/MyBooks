/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integration.Forum;

import business.Forum.TransferComment;
import business.Forum.TransferThread;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ángela
 */
public class ThreadDAOImp implements ThreadDAO {

    @Override
    public TransferThread readThread(String id) throws IOException {
        File archivo = new File("Forum.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }

        Scanner sc = new Scanner(archivo);
        String forum;
        String forumArray[];
        TransferThread Tthread = null;
        boolean encontrado = false;

        while (sc.hasNext() && !encontrado) {
            forum = sc.nextLine();
            forumArray = forum.split(" ");
            if (forumArray[0].equalsIgnoreCase("" + id)) {
                encontrado = true;
                Tthread = new TransferThread(forumArray[0], forumArray[1], forumArray[2], forumArray[3], forumArray[4]);
            }
        }
        sc.close();
        return Tthread;

    }

    @Override
    public void createThread(TransferThread Thread) throws IOException {
        File archivo = new File("Forum.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true));
        if (archivo.exists()) {
            writer.write(Thread.getID());
            writer.write(" ");
            writer.write(Thread.getTitle());
            writer.write(" ");
            writer.write(Thread.getText());
            writer.write(" ");
            writer.write(Thread.getDate());
            writer.write(" ");
            System.out.println("Create thread");
            writer.append(Thread.toString());
            writer.newLine();
        }
        writer.close();

    }

    @Override
    public void updateThread(TransferThread Thread, TransferComment comment) throws IOException {
        String datos;
        String forumArray[];
        File archivo = new File("Forum.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        archivo.renameTo(new File("ForumAux.txt"));
        File archivoViejo = new File("ForumAux.txt");
        Scanner sc = new Scanner(archivoViejo);

        while (sc.hasNext()) {
            datos = sc.nextLine();
            forumArray = datos.split(" ");
            if (forumArray[0].equalsIgnoreCase(Thread.getID())) {
                TransferThread Tthread2 = new TransferThread(Thread.getID(),Thread.getTitle(),Thread.getText(),Thread.getAuthor(),Thread.getDate());
                Tthread2.getComments().add(comment);
                createThread(Tthread2);
            } else {
                TransferThread Tthread = new TransferThread(forumArray[0], forumArray[1], forumArray[2], forumArray[3], forumArray[4]);
                createThread(Tthread);
            }
        }
        sc.close();
        archivoViejo.delete();

    }

    @Override
    public void deleteThread(TransferThread thread) throws IOException{
        String datos;
        String forumArray[];
        File archivo = new File("Forum.txt");
        if (!archivo.exists()) {
            archivo.createNewFile();
        }
        archivo.renameTo(new File("ForumAux.txt"));
        File archivoViejo = new File("ForumAux.txt");
        Scanner sc = new Scanner(archivoViejo);

        while (sc.hasNext()) {
            datos = sc.nextLine();
            forumArray = datos.split(" ");
            if (forumArray[0].equalsIgnoreCase(thread.getID())) {
                //Aqui no hacemos nada, porque queremos eliminar el contenido de ese hilo
            } else {
                TransferThread Tthread = new TransferThread(forumArray[0], forumArray[1], forumArray[2], forumArray[3], forumArray[4]);
                createThread(Tthread);
            }
        }
        sc.close();
        archivoViejo.delete();
    }

}
