package controller;

import bean.Request;
import bean.Response;
import command.Command;
import controller.exception.CommandHelperException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Controller {
    private final CommandHelper helper = new CommandHelper();
//    private static final Logger LOGGER = LogManager.getRootLogger();
//    private static final Logger LOGGER = LogManager.getLogger(Controller.class);


    public Controller() {
    }

    public Response doAction(Request request) {
        try {
            String commandName = request.getCommandName();
            Command command = helper.getCommand(commandName);
            Response response = command.execute(request);
//            LOGGER.info(response.getStatusMessage());
            return response;
        } catch (CommandHelperException ex) {
            Response response = new Response();
            response.setStatusMessage(request.getCommandName() + "not exists", false);
//            LOGGER.info(response.getStatusMessage());
//            LOGGER.error(ex);
            return response;
        }
    }


}
