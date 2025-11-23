package BibliotecaEnConsola;

public class User {

    // ATRIBUTES

    private String name;
    private String apellido;
    private String userName;
    private String email;
    private String password;
    private String phone;

    // CONSTRUCTOR

    public User(String userName, String email, String password) {
        this("Unknown", "Unknown", userName, email, password, "Unknown");
    }

    public User(String name, String apellido, String userName, String email, String password, String phone) {
        this.name = name;
        this.apellido = apellido;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // TO STRING

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
