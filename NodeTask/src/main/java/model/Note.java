package model;


import java.util.Date;

public class Note {

    private String text;

    private Date data;

    public Note(String text) {
        this.text = text;
        data = new Date();
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (text != null ? !text.equals(note.text) : note.text != null) return false;
        return data != null ? data.equals(note.data) : note.data == null;

    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}
