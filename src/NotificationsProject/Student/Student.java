package NotificationsProject.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class Student {

    // ATRIBUTES

    private final int id;
    private final String dni;
    private final String nif;
    private String name;
    private String lastName;
    private String location;
    private String address;
    private String email;
    private String phone;
    private LinkedList<String> notifications;
    private ArrayList<Map<String, Double>> marks;

    // CONSTRUCTOR

    public Student() {
        this.id = id;
        this.dni = dni;
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.location = location;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.notifications = notifications;
        this.marks = marks;
    }

    // GETTERS AND SETTERS


    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LinkedList<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(LinkedList<String> notifications) {
        this.notifications = notifications;
    }

    public ArrayList<Map<String, Double>> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Map<String, Double>> marks) {
        this.marks = marks;
    }
}
