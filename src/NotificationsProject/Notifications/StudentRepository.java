package NotificationsProject.Notifications;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentRepository {

    public static final ArrayList<Student> estudiantesInstituto = new ArrayList<>();

    static {
        for (int i = 1; i <= 50; i++) {
            Student s = new Student(
                    i,
                    "DNI" + i,
                    "NIF" + i,
                    "Name" + i,
                    "LastName" + i,
                    "Location" + i,
                    "Address" + i,
                    "email" + i + "@school.com",
                    "60000" + i,
                    new LinkedList<>(),
                    new ArrayList<>()
            );

            estudiantesInstituto.add(s);
        }
    }
}
