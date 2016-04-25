package model;


import java.util.ArrayList;
import java.util.List;

public class NoteBook {
    List<Note> notes;

    public NoteBook() {
        this.notes = new ArrayList<Note>();
    }

    public void add(Note note){
        notes.add(note);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "notes=" + notes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteBook noteBook = (NoteBook) o;

        return notes != null ? notes.equals(noteBook.notes) : noteBook.notes == null;

    }

    @Override
    public int hashCode() {
        return notes != null ? notes.hashCode() : 0;
    }
}
