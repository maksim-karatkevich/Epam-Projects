package model;


import java.util.Date;

public class Note {

    private String text;
    private Date data;

    public Note(String text) {
        this.text = text;
        data = new Date();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Note note = (Note) obj;
        if (null == text) {
            return (text == note.text);
        } else {
            if (!text.equals(note.text)) {
                return false;
            }
        }
        if (null == data) {
            return (data == note.data);
        } else {
            if (!data.equals(note.data)) {
                return false;
            }

        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = text != null ? text.hashCode() : 0;
            result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}

