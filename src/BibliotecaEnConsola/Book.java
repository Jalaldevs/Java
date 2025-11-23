package BibliotecaEnConsola;

public class Book {

    // ATRIBUTES

    private final int id;
    private String name;
    private String editorial;
    private String author;
    private int age;
    private double price;

    // CONSTRUCTOR

    public Book(int id, String name, double price) {
        this(id, name,"Unknown","Unknown",-1, price);
    }

    public Book(int id, String name, String editorial, String author, int age, double price) {
        this.id = id;
        this.name = name;
        this.editorial = editorial;
        this.author = author;
        this.age = age;
        this.price = price;
    }

    // GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // TO STRING

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", editorial='" + editorial + '\'' +
                ", author='" + author + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    // METHODS

    public double finalPrice () {
        return this.price * 2.5;
    }
}
