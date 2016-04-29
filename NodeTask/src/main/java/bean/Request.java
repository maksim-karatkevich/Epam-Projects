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

    public Request(String commandName, String arg){
        this.commandName = commandName;
        this.arg = arg;
    }

    public Request(String commandName){
        this.commandName = commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }

}
