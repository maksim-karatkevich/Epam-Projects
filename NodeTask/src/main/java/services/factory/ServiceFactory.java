package services.factory;


import services.factory.impl.NoteBookServiceImpl;

public class ServiceFactory {
    private static ServiceFactory factory = new ServiceFactory();

    private final NoteBookServiceImpl noteBookService = new NoteBookServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return factory;
    }

    public NoteBookServiceImpl getNoteBookService() { return noteBookService; }

}
