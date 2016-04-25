import model.Note;
import model.NoteBookConsoleView;
import model.NoteBookProvider;

public class Main {
    public static void main(String[] args) {
        NoteBookProvider.getInstance().add(new Note("Some note"));
        NoteBookProvider.getInstance().add(new Note("Some note 1"));
        NoteBookProvider.getInstance().add(new Note("Some note 2"));
        NoteBookProvider.getInstance().add(new Note("Some note 3"));
        NoteBookProvider.getInstance().add(new Note("Some note 3"));
        NoteBookConsoleView.print(NoteBookProvider.getInstance());

//        NoteBookConsoleView.

    }
}
