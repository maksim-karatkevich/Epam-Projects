package stax.parser;


public enum BookTagName {
    TITLE, AUTHOR, GENRE, LANGUAGE, BOOK, BOOKS, LIBRARY;

    public static BookTagName getElementTagName(String element) {
        switch (element) {
            case "Title": return TITLE;
            case "Author": return AUTHOR;
            case "Genre": return GENRE;
            case "Language": return LANGUAGE;
            case "Book": return BOOK;
            case "Books": return BOOKS;
            case "Library": return LIBRARY;
            default: throw new EnumConstantNotPresentException(BookTagName.class, element);
        }
    }
}
