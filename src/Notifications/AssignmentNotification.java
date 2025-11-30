package Notifications;

public class AssignmentNotification extends Notification{

    // ATRIBUTES

    private String subject;
    private String details;
    private String dateLimit;

    // CONSTRUCTOR

    public AssignmentNotification(int id, String title, String description, String date, String hour, String subject, String details, String fechaLimite) {
        super(id, title, description, date, hour);
        this.subject = subject;
        this.details = details;
        this.dateLimit = dateLimit;
    }

    // GETTERS & SETTERS

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLimit() {
        return dateLimit;
    }

    public void setLimit(String limit) {
        this.dateLimit = limit;
    }

    // TO STRING

    @Override
    public String toString() {
        return "AssignmentNotification{" +
                super.toString() +
                "subject='" + subject + '\'' +
                ", details='" + details + '\'' +
                ", dateLimit='" + dateLimit + '\'' +
                '}';
    }

}
