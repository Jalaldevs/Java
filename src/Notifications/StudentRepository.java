package Notifications;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository {

    public static final ArrayList<Student> estudiantesInstituto = new ArrayList<>();

    static {
        estudiantesInstituto.add(new Student(1, "DNI1", "NIF1", "Name1", "LastName1", "Loc1", "Addr1", "e1@school.com", "600001",
                new LinkedList<>(), new ArrayList<>(List.of(6.0, 7.5, 8.0))));
        estudiantesInstituto.add(new Student(2, "DNI2", "NIF2", "Name2", "LastName2", "Loc2", "Addr2", "e2@school.com", "600002",
                new LinkedList<>(), new ArrayList<>(List.of(4.0, 5.0, 6.0))));
        estudiantesInstituto.add(new Student(3, "DNI3", "NIF3", "Name3", "LastName3", "Loc3", "Addr3", "e3@school.com", "600003",
                new LinkedList<>(), new ArrayList<>(List.of(7.0, 8.0, 9.0))));
        estudiantesInstituto.add(new Student(4, "DNI4", "NIF4", "Name4", "LastName4", "Loc4", "Addr4", "e4@school.com", "600004",
                new LinkedList<>(), new ArrayList<>(List.of(3.0, 4.0, 5.0))));
        estudiantesInstituto.add(new Student(5, "DNI5", "NIF5", "Name5", "LastName5", "Loc5", "Addr5", "e5@school.com", "600005",
                new LinkedList<>(), new ArrayList<>(List.of(9.0, 8.5, 7.5))));
        estudiantesInstituto.add(new Student(6, "DNI6", "NIF6", "Name6", "LastName6", "Loc6", "Addr6", "e6@school.com", "600006",
                new LinkedList<>(), new ArrayList<>(List.of(5.5, 6.0, 6.5))));
        estudiantesInstituto.add(new Student(7, "DNI7", "NIF7", "Name7", "LastName7", "Loc7", "Addr7", "e7@school.com", "600007",
                new LinkedList<>(), new ArrayList<>(List.of(6.0, 7.0, 7.5))));
        estudiantesInstituto.add(new Student(8, "DNI8", "NIF8", "Name8", "LastName8", "Loc8", "Addr8", "e8@school.com", "600008",
                new LinkedList<>(), new ArrayList<>(List.of(4.0, 5.5, 6.0))));
        estudiantesInstituto.add(new Student(9, "DNI9", "NIF9", "Name9", "LastName9", "Loc9", "Addr9", "e9@school.com", "600009",
                new LinkedList<>(), new ArrayList<>(List.of(7.5, 8.0, 9.0))));
        estudiantesInstituto.add(new Student(10, "DNI10", "NIF10", "Name10", "LastName10", "Loc10", "Addr10", "e10@school.com", "600010",
                new LinkedList<>(), new ArrayList<>(List.of(3.0, 4.0, 3.5))));
    }
}
