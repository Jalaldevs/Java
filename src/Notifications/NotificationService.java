package Notifications;

public class NotificationService {

    public static void sendBackToSchoolNotification(int id, String title, String desc, String date, String hour) {

        for (Student student : StudentRepository.estudiantesInstituto) {
            Notification notification = new Notification(id, title, desc, date, hour);
            student.receiveNotification(notification);
        }

    }

    public static void examNotification(int id, String title, String desc, String date, String hour, String subject, String details, double mark) {

        for (Student student : StudentRepository.estudiantesInstituto) {
            ExamNotification notification = new ExamNotification(id, title, desc, date, hour, subject, details, mark);
            student.receiveNotification(notification);
        }



    }

}
