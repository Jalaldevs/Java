package NotificationsProject.Notifications;

public class NotificationService {

    public static void sendBackToSchoolNotification(int id, String title, String desc, String date, String hour) {

        for (Student student : StudentRepository.estudiantesInstituto) {
            Notification notification = new Notification(id, title, desc, date, hour);
            student.receiveNotification(notification);
        }

    }



}
