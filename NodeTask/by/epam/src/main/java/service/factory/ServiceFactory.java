package service.factory;


import service.impl.NoteBookServiceImpl;

public class ServiceFactory {

    private static final ServiceFactory factory = new ServiceFactory();

    private final NoteBookServiceImpl noteBookService = new NoteBookServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return factory;
    }

    public NoteBookServiceImpl getNoteBookService() { return noteBookService; }

}
