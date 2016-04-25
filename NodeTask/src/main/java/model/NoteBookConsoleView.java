package model;

import java.util.List;


public class NoteBookConsoleView {

    public static void print(Note note) {
        System.out.println(note.toString());
    }

    public static void print(NoteBook noteBook) {
        for (Note n : noteBook.notes) {
            System.out.println(n.toString());
        }
    }

    public static void print(List<Note> list) {
        for (Note n : list) {
            System.out.println(n.toString());
        }
    }
}
