package SistemaDeContactos;

import java.util.ArrayList;

public class User {

    // ATRIBUTES

    private String firstName;
    private String lastName;
    private final String phone;
    private final String userName;
    private String password;
    private String email;
    private String dateOfBirth;
    private int age;
    private ArrayList<Contact> Contacts = new ArrayList<>();

    // recibir SMS , recibir emails, recibir llamadas, recibir CHATapp message

    // SEND THEM


    // CONSTRUCTOR

    public User(String phone, String userName, String password, String firstName, String lastName, String email, String dateOfBirth) {
        this.phone = phone;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = "Unknown";
        this.age = -1;

        // PASSWORD ?¿?

    }

    // GETTERS

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    // SETTERS

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // METHODS

    public void addContact (String fullName, String phone) {
        Contact contact = new Contact(fullName, phone);
        this.Contacts.add(contact);
    }

    public void removeContact (String phone) {
        for (int i = 0; i < this.Contacts.size(); i++) {
            Contact contact = this.Contacts.get(i);
            if (phone.equals(contact.getPhone())) {
                this.Contacts.remove(contact);
            }
        }
    }



    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                '}';
    }
}
