package services;


import dao.DAOFactory;
import dao.impl.FileWorkerDAO;
import model.Note;
import model.NoteBook;
import model.NoteBookProvider;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteBookService {

    private NoteBook noteBook;

    public NoteBookService(){}

    public NoteBook createNoteBook() {
        noteBook = NoteBookProvider.getInstance().getNoteBook();
        return noteBook;
    }

    public void addNote(Note note) {
        NoteBookProvider.getInstance().getNoteBook().add(note);
    }

    public Note findNoteOnContent(String text) throws Exception {
        for (Note note : NoteBookProvider.getInstance().getNoteBook().getNotes()) {
            if (note.getText().equals(text)) {
                return note;
            }
        }
        return null;
    }

    public List<Note> findNoteOnDate(String date) throws ParseException {
        List<Note> list = new ArrayList<>();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date d = format.parse(date);
        for (Note note : NoteBookProvider.getInstance().getNoteBook().getNotes()){
            if (format.parse(format.format(note.getData())).compareTo(d) == 0){
                list.add(note);
            }
        }

        return list;
    }

    public NoteBook loadNoteBook(String path) throws IOException, ClassNotFoundException {
        NoteBook noteBook = null;
        FileWorkerDAO fileWorkerDAO = DAOFactory.getInstance().getFileWorkerDAO();
        noteBook = fileWorkerDAO.loadNoteBookFromDirectory(path, noteBook);
        return noteBook;
    }

    public List<Note> showNotes() {
        List<Note> list = new ArrayList<>();
        for (Note note : NoteBookProvider.getInstance().getNoteBook().getNotes()){
            list.add(note);
        }
        return list;
    }

    public void writeNoteBookOnFile(String path) {
        FileWorkerDAO fileWorkerDAO = DAOFactory.getInstance().getFileWorkerDAO();
        fileWorkerDAO.saveNoteBookInDirectory(path);
    }

}
