package SistemaDeCarpetas;

public class File {

    // ATRIBUTES

    private String name;
    private double size;          // Tamaño en KB, MB, etc.
    private String extension;     // .txt, .jpg, .mp4...
    private String content;       // Opcional, si quieres guardar texto u otra info interna

    // CONSTRUCTORS

    public File(String name, String extension, double size) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.content = "";
    }

    // GETTERS & SETTERS

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

    public String getExtension() { return extension; }
    public void setExtension(String extension) { this.extension = extension; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    // TO STRING

    @Override
    public String toString() {
        return "FILE: " + name + extension + " (" + size + " KB)";
    }
}

