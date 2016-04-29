package controller;

import bean.Request;
import bean.Response;
import command.Command;

public class Controller {
    private final CommandHelper helper = new CommandHelper();

    public Controller(){}

    public Response doAction(Request request) throws Exception {
        String commandName = request.getCommandName();
        Command command = helper.getCommand(commandName);
        return command.execute(request);
    }

}
