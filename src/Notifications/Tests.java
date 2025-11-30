package Notifications;

public final class Tests {

    public static void main(String[] args) {

        NotificationService.sendBackToSchoolNotification(132451, "Back to Schools", "Remember that we open doors next monday 17 of July", "07/07/2004", "22:00");

        for ( Student student : StudentRepository.estudiantesInstituto ) {
            System.out.println(student.getNotifications());
        }

    }

}
