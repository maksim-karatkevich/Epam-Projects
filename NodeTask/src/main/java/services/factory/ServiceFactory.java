package services.factory;


import services.NoteBookService;

public class ServiceFactory {
    private static ServiceFactory factory = new ServiceFactory();

    private final NoteBookService noteBookService = new NoteBookService();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return factory;
    }

    public NoteBookService getNoteBookService() { return noteBookService; }

}
