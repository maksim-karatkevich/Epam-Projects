package dao.impl;


import controller.Controller;
import dao.FileDAO;
import dao.exception.DAOException;
import model.NoteBook;
import model.NoteBookProvider;
import java.io.*;

public class FileDAOImpl implements FileDAO {

    public void save(String path) throws DAOException {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(NoteBookProvider.getInstance().getNoteBook());
        } catch (FileNotFoundException e) {
            Controller.getLogger().error(e);
            throw new DAOException("File not found exception", e);
        } catch (IOException e) {
            Controller.getLogger().error(e);
            throw new DAOException("IOException", e);
        }

    }

    public NoteBook load(String path, NoteBook noteBook) throws DAOException {
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            noteBook = (NoteBook) in.readObject();
        } catch (ClassNotFoundException e) {
            Controller.getLogger().error(e);
            throw new DAOException("Class not found exception", e);
        } catch (FileNotFoundException e) {
            Controller.getLogger().error(e);
            throw new DAOException("File not found exception", e);
        } catch (IOException e) {
            Controller.getLogger().error(e);
            throw new DAOException("IOException", e);
        }
        return noteBook;
    }
}
