package bean;


public class Response {
    private String message = "completed successfully";
    private String errorMessage = "fail";
    private String statusMessage;

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage, boolean failOrNot) {
        if (failOrNot) {
            this.statusMessage = statusMessage + " " + message;
        } else this.statusMessage = statusMessage + " " + errorMessage;
    }
}
