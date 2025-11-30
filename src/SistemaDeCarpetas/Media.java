package SistemaDeCarpetas;

public class Media {

    public enum MediaType {
        IMAGE, VIDEO
    }

    private String name;
    private double size;        // Tamaño del archivo en MB
    private String extension;   // jpg, png, mp4, etc
    private MediaType type;     // Imagen o video

    public Media(String name, double size, String extension, MediaType type) {
        this.name = name;
        this.size = size;
        this.extension = extension;
        this.type = type;
    }

    // ---------------- GETTERS & SETTERS ----------------

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getSize() { return size; }
    public void setSize(double size) { this.size = size; }

    public String getExtension() { return extension; }
    public void setExtension(String extension) { this.extension = extension; }

    public MediaType getType() { return type; }
    public void setType(MediaType type) { this.type = type; }


    public String getFullName() {
        return name + "." + extension;
    }

    public boolean isImage() {
        return type == MediaType.IMAGE;
    }

    public boolean isVideo() {
        return type == MediaType.VIDEO;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", size=" + size + " MB" +
                ", extension='" + extension + '\'' +
                ", type=" + type +
                '}';
    }
}
