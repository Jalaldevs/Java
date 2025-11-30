package Notifications;

public class ExamNotification extends Notification {

    // ATRIBUTES

    private String subject;
    private String details;
    private double mark;

    // CONSTRUCTOR

    public ExamNotification(int id, String title, String description, String date, String hour, String subject, String details, double mark) {
        super(id, title, description, date, hour);
        this.subject = subject;
        this.details = details;
        this.mark = mark;
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    // TO STRING

    @Override
    public String toString() {
        return "ExamNotification{" +
                super.toString() +
                "subject='" + subject + '\'' +
                ", details='" + details + '\'' +
                ", mark=" + mark +
                '}';
    }

    // METHODS

    public boolean isPassed () {
        if (this.mark < 5.0) {
            return false;
        }
        return true;
    }


}
