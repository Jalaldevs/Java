package Notifications;

import java.util.ArrayList;
import java.util.LinkedList;

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
    private LinkedList<Notification> notifications;
    private ArrayList<Double> marks;

    // CONSTRUCTOR

    public Student(int id, String dni, String nif, String name, String lastName, String location, String address, String email, String phone, LinkedList<Notification> notifications, ArrayList<Double> marks) {
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

    public Student(int id, String dni, String nif, String name, String lastName, String location, String address, String email, String phone) {
        this.id = id;
        this.dni = dni;
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.location = location;
        this.address = address;
        this.email = email;
        this.phone = phone;
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

    public LinkedList<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(LinkedList<Notification> notifications) {
        this.notifications = notifications;
    }

    public ArrayList<Double> getMarks() {
        return marks;
    }

    public void setMarks(ArrayList<Double> marks) {
        this.marks = marks;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nif='" + nif + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", notifications=" + notifications +
                ", marks=" + marks +
                '}';
    }

    // METHODS

    public void receiveNotification (Notification notification) {
        notifications.add(notification);
    }

    public double avaregeTotalMarks() {
        double mark;
        double total = 0.0;
        double avarege;
        for (int i = 0; i < this.marks.size(); i++) {
            mark = this.marks.get(i);
            total += mark;
        }
        avarege = total / this.marks.size();
        return avarege;
    }



}
