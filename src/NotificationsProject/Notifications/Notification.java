package NotificationsProject.Notifications;

public class Notification {

    // ATRIBUTES

    private final int id;
    private String title;
    private String description;
    private String date;
    private String hour;

    // CONSTRUCTOR

    public Notification(int id, String title, String description, String date, String hour) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.hour = hour;
    }

    // GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                '}';
    }


}

