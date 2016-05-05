package service.factory.impl;


import controller.Controller;
import dao.DAOFactory;
import dao.exception.DAOException;
import dao.impl.FileDAOImpl;
import model.Note;
import model.NoteBook;
import model.NoteBookProvider;
import service.factory.NoteBookService;
import service.factory.exception.ServiceException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteBookServiceImpl implements NoteBookService {

    public NoteBookServiceImpl() {
    }

    @Override
    public void createNoteBook() {
        NoteBookProvider.getInstance().getNoteBook();
    }

    @Override
    public void addNote(String noteText) {
        Note note = new Note(noteText);
        NoteBookProvider.getInstance().getNoteBook().add(note);
    }

    @Override
    public Note findNoteOnContent(String text) {
        for (Note note : NoteBookProvider.getInstance().getNoteBook().getNotes()) {
            if (note.getText().equals(text)) {
                return note;
            }
        }
        return null;
    }

    @Override
    public List<Note> findNoteOnDate(String date) throws ServiceException {
        List<Note> list = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = format.parse(date);
            for (Note note : NoteBookProvider.getInstance().getNoteBook().getNotes()) {
                if (format.parse(format.format(note.getData())).compareTo(d) == 0) {
                    list.add(note);
                }
            }

        } catch (ParseException ex) {
            Controller.getLogger().error(ex);
            throw new ServiceException(date + " incorrect format");

        }

        return list;
    }

    @Override
    public NoteBook loadNoteBook(String path) throws ServiceException {
        NoteBook noteBook = null;
        try {
            FileDAOImpl fileDAOImpl = DAOFactory.getInstance().getFileDAOImpl();
            noteBook = fileDAOImpl.load(path, noteBook);
        } catch (DAOException ex) {
            Controller.getLogger().error(ex);
            throw new ServiceException("Load note book", ex);
        }
        return noteBook;
    }

    @Override
    public List<Note> showNotes() {
        List<Note> list = new ArrayList<>();
        for (Note note : NoteBookProvider.getInstance().getNoteBook().getNotes()) {
            list.add(note);
        }
        return list;
    }

    @Override
    public void saveNoteBookOnFile(String path) throws ServiceException {
        try {
            FileDAOImpl fileDAOImpl = DAOFactory.getInstance().getFileDAOImpl();
            fileDAOImpl.save(path);
        } catch (DAOException ex) {
            Controller.getLogger().error(ex);
            throw new ServiceException("File not found", ex);
        }
    }

}
