package bean;


public class Response {
    private String massage = "completed successfully ";
    private String errorMassage = "fail ";
    private String statusMassage;

    public String getStatusMassage() {
        return statusMassage;
    }

    public void setStatusMassage(String statusMassage, boolean failOrNot) {
        if (failOrNot){
        this.statusMassage = statusMassage + " " + massage;
        } else this.statusMassage = statusMassage + " " + errorMassage;

    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getErrorMassage() {
        return errorMassage;
    }

    public void setErrorMassage(String errorMassage) {
        this.errorMassage = errorMassage;
    }
}
