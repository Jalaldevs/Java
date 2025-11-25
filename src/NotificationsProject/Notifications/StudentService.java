package NotificationsProject.Notifications;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentService {

    public static Student addStudents (int id, String dni, String nif, String name, String lastName, String location, String address, String email, String phone ) {
        Student student = new Student(id, dni, nif, name, lastName, location, address, email, phone);
        return student;
    }

}
