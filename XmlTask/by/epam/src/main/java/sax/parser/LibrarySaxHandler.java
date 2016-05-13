package sax.parser;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;



public class LibrarySaxHandler extends DefaultHandler {
    private List<Book> bookList = new ArrayList<Book>();
    private Book book;
    private StringBuilder text;

    public List<Book> getBookList() {
        return bookList;
    }

    public void start() throws SAXException {
        System.out.println("Start");
    }

    public void end() throws SAXException {
        System.out.println("End");
    }

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attributes) throws SAXException {
        qName = qName.replaceAll("lib:", "");
        text = new StringBuilder();
        if (qName.equals("Book")) {
            book = new Book();
        }
    }

    @Override
    public void characters(char[] buffer, int start, int length) {
        text.append(buffer, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName)
            throws SAXException {
        qName = qName.replaceAll("lib:", "");
        LibraryTagName tagName = LibraryTagName.valueOf(qName.toUpperCase().replace("-", "_"));
        switch (tagName) {
            case TITLE:
                book.setTitle(text.toString());
                break;
            case AUTHOR:
                book.setAuthor(text.toString());
                break;
            case LANGUAGE:
                book.setLanguage(text.toString());
                break;
            case GENRE:
                book.setGenre(text.toString());
                break;
            case BOOK:
                bookList.add(book);
                book = null;
                break;
        }

    }

    @Override
    public void warning(SAXParseException ex) {
        System.err.print("Warning: line " + ex.getLineNumber() + ex.getMessage());
    }

    @Override
    public void error(SAXParseException ex) {
        System.err.print("Error: line " + ex.getLineNumber() + ex.getMessage());

    }

    @Override
    public void fatalError(SAXParseException ex) throws SAXException {
        System.err.print("Fatal: line " + ex.getLineNumber() + ex.getMessage());
        throw (ex);
    }
}

