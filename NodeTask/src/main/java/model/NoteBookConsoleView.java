package model;

import java.util.List;


public class NoteBookConsoleView {
    // вывод данных об одной записи
    public static void print(Note note) {
        System.out.println(note.toString());
    }
    // вывод данный о всех записях
    public static void print(NoteBook noteBook) {
        for (Note n : noteBook.getNotes()) {
            System.out.println(n.getText());
        }
    }

    // вывод данный о нескольких записях
    public static void print(List<Note> list) {
        for (Note n : list) {
            System.out.println(n.toString());
        }
    }

}
