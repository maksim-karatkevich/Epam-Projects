package command;


import bean.Request;
import bean.Response;

public interface Command {
    public Response execute(Request request);
}
