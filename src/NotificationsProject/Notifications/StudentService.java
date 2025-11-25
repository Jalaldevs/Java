package NotificationsProject.Notifications;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentService {

    public static Student addStudents (int id, String dni, String nif, String name, String lastName, String location, String address, String email, String phone ) {
        Student student = new Student(id, dni, nif, name, lastName, location, address, email, phone);
        return student;
    }

    public static ArrayList<Student> studentsThatPassCourse () {
        ArrayList<Student> studentsThatPassCourse = new ArrayList<>();
        for (int i = 0; i < StudentRepository.estudiantesInstituto.size(); i++) {
            Student student = StudentRepository.estudiantesInstituto.get(i);
            if (student.avaregeTotalMarks() >= 5.0) {
                studentsThatPassCourse.add(student);
            }
        }
        return studentsThatPassCourse;
    }

    public static ArrayList<Student> top3StudentsByMarksAverage() {
        StudentRepository.estudiantesInstituto.sort(
                (a, b) -> Double.compare(b.avaregeTotalMarks(), a.avaregeTotalMarks())
        );
        ArrayList<Student> top3 = new ArrayList<>();
        for (int i = 0; i < Math.min(3, StudentRepository.estudiantesInstituto.size()); i++) {
            top3.add(StudentRepository.estudiantesInstituto.get(i));
        }
        return top3;
    }


}
