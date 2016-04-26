package controller;

import bean.Request;
import bean.Response;
import command.*;

import java.text.ParseException;

public class Controller {

    public Response doAction(Request request) throws ParseException {
        Command command = CommandFactory.getCommand(request.getCommandName());
        return command.execute(request);
    }

}
