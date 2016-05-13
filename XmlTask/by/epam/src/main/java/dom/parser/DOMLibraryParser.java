package dom.parser;


import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sax.parser.Book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMLibraryParser {
    public static void main(String[] args) throws IOException, SAXException {
        DOMParser parser = new DOMParser();
        parser.parse("/Users/maksim_kevich/Desktop/ideaProjects/XmlTask/src/xml/librery.xsd.xml");
        Document document = parser.getDocument();

        Element root = document.getDocumentElement();

        List<Book> list = new ArrayList<>();

        NodeList bookList = root.getElementsByTagName("lib:Book");
        Book book = null;

        for (int i = 0; i < bookList.getLength(); i++) {
            book = new Book();
            Element bookElement = (Element) bookList.item(i);
            book.setTitle(getSingleChild(bookElement, "lib:Title").getTextContent().trim());
            book.setAuthor(getSingleChild(bookElement, "lib:Author").getTextContent().trim());
            book.setGenre(getSingleChild(bookElement, "lib:Genre").getTextContent().trim());
            book.setLanguage(getSingleChild(bookElement, "lib:Language").getTextContent().trim());
            list.add(book);
        }
        for (Book b : list){
            System.out.println(b.toString());
        }
    }

    private static Node getSingleChild(Element bookElement, String name) {
        NodeList l = bookElement.getElementsByTagName(name);
        Element child = (Element) l.item(0);
        return child;
    }
}
