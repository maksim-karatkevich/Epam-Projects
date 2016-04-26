package controller;

import bean.Request;
import bean.Response;
import command.*;

public class Controller {
//    public final Controller controller = new Controller();

    public Response doAction(Request request) {
        Command command = CommandFactory.getCommand(request.getCommandName());
        return command.execute(request);
    }

}
