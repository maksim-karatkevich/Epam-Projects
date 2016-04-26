package bean;


public class Request {

    private String arg;
    private String commandName;

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }



    public Request() {
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

}
