package command;

import bean.Request;
import bean.Response;
import java.text.ParseException;

public interface Command {
    Response execute(Request request) throws ParseException;
}
