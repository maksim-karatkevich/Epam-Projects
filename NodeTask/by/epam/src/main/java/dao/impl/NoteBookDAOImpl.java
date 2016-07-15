package dao.impl;

import connectionPool.ConnectionPool;
import connectionPool.ConnectionPoolFactory;
import connectionPool.exeptions.ConnectionPoolException;
import dao.NoteBookDAO;
import model.Note;
import model.NoteBook;
import model.NoteBookProvider;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class NoteBookDAOImpl implements NoteBookDAO {
    private ConnectionPool cp;

    public NoteBookDAOImpl() {
        this.cp = ConnectionPoolFactory.getInstance().getConnectionPool();
        try {
            cp.initPoolData();
        } catch (ConnectionPoolException ex) {

        }
    }

    @Override
    public void addNoteBook(NoteBook noteBook) {

    }

    @Override
    public void addNote(String massage) {
        try {
            Connection connection = cp.takeConnection();
            Statement statement = connection.createStatement();
            Note note = new Note(massage);
            NoteBookProvider.getInstance().getNoteBook().add(note);
            statement.executeUpdate("INSERT INTO `Nodes` (`NoteContent`) VALUES ('" + note.getText() + "')");

        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Note getNote() {
        return null;
    }

    @Override
    public List<Note> getNotes() {
        List<Note> s = new ArrayList<>();
        try {
            Connection connection = cp.takeConnection();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Nodes");
            while (rs.next()) {
                NoteBookProvider.getInstance().getNoteBook().add(new Note(rs.getString("noteContent")));
            }
        } catch (SQLException e) {

        } catch (ConnectionPoolException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public NoteBook getNoteBook() {
        return null;
    }
}
