package bean;


public class Request {
    private String commandName;
    private String login;
    private String password;
    private String title;

    public Request(String login, String password, String title) {
        super();
        this.login = login;
        this.password = password;
        this.title = title;
    }

}
