package controller;

import bean.Request;
import bean.Response;
import command.Command;
import command.exception.CommandException;
import controller.exception.CommandHelperException;

public class Controller {
    private final CommandHelper helper = new CommandHelper();

    public Controller(){}

    public Response doAction(Request request) {
        try {
            String commandName = request.getCommandName();
            Command command = helper.getCommand(commandName);
            return command.execute(request);
        } catch (CommandHelperException ex){
            Response response = new Response();
            response.setStatusMessage(request.getCommandName() + "not exists", false);
            return response;
        }
    }

}
