package sax.parser;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLReaderFactory;
import org.xml.sax.XMLReader;

import java.io.IOException;
import java.util.List;


public class ParserRun {
    public static void main(String[] args) throws SAXException, IOException {


        XMLReader reader = XMLReaderFactory.createXMLReader();
        LibrarySaxHandler handler = new LibrarySaxHandler();
        reader.setContentHandler(handler);
        reader.parse(new InputSource("/Users/maksim_kevich/Desktop/ideaProjects/XmlTask/src/xml/librery.xsd.xml"));
//        reader.parse(new InputSource("/Users/maksim_kevich/Desktop/ideaProjects/XmlTask/src/xml/text.xml"));
        List<Book> books = handler.getBookList();


        for (Book book : books) {
            System.out.println(book.getAuthor());
            System.out.println(book.getGenre());
        }

    }
}
