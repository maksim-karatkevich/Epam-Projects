package model;


public class NoteBookProvider {
    private static NoteBook instance;

    private NoteBookProvider() {}

    public static NoteBook getInstance() {
        if (instance == null) {
            instance = new NoteBook();
        }
        return instance;
    }

}
