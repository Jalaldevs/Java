package SistemaDeContactos;

public class Contact {

    // ATRIBUTES

    private String fullName;
    private final String phone;

    // CONSTRUCTOR

    public Contact(String phone, String fullName) {
        this.phone = phone;
        this.fullName = fullName;
    }

    // GETTERS

    public String getFullName() {
        return fullName;
    }

    public String getPhone() {
        return phone;
    }

    // SETTERS

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // METHODS



    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
