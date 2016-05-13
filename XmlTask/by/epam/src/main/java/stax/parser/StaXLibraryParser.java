package stax.parser;

import sax.parser.Book;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.*;


public class StaXLibraryParser {

    public static void main(String[] args) {
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        try {
            InputStream inputStream = new FileInputStream("/Users/maksim_kevich/Desktop/ideaProjects/XmlTask/src/xml/librery.xsd.xml");
            XMLStreamReader reader = inputFactory.createXMLStreamReader(inputStream);

            List<Book> list = process(reader);

            for (Book book : list) {
                System.out.println(book.toString());
            }


        } catch (XMLStreamException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static List<Book> process(XMLStreamReader reader) throws XMLStreamException {
        List<Book> list = new ArrayList<>();
        Book book = null;
        BookTagName elementName = null;

        while (reader.hasNext()) {
            int type = reader.next();

            switch (type) {
                case XMLStreamConstants.START_ELEMENT:
                    elementName = BookTagName.getElementTagName(reader.getLocalName());

                    switch (elementName) {
                        case BOOK:
                            book = new Book();
                            break;
                    }
                    break;
                case XMLStreamConstants.CHARACTERS:
                    String text = reader.getText().trim();
                    if (text.isEmpty()) {
                        break;
                    }
                    switch (elementName) {
                        case TITLE:
                            book.setTitle(text);
                            break;
                        case AUTHOR:
                            book.setAuthor(text);
                            break;
                        case GENRE:
                            book.setGenre(text);
                            break;
                        case LANGUAGE:
                            book.setLanguage(text);
                            break;
                    }
                    break;
                case XMLStreamConstants.END_ELEMENT:
                    elementName = BookTagName.getElementTagName(reader.getLocalName());
                    switch (elementName) {
                        case BOOK:
                            list.add(book);
                    }
            }
        }
        return list;
    }
}
