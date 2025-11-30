package SistemaDeCarpetas;

import java.util.ArrayList;


public class Folder {

    // ---------------- ATRIBUTOS ----------------
    private String name;
    private ArrayList<File> files;
    private ArrayList<Folder> subFolders;
    private ArrayList<Media> images;
    private ArrayList<Media> videos;

    // ---------------- CONSTRUCTOR PRINCIPAL ----------------
    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
        this.images = new ArrayList<>();
        this.videos = new ArrayList<>();
    }

    // ---------------- GETTERS ----------------
    public String getName() { return name; }
    public ArrayList<File> getFiles() { return files; }
    public ArrayList<Folder> getSubFolders() { return subFolders; }
    public ArrayList<Media> getImages() { return images; }
    public ArrayList<Media> getVideos() { return videos; }


    // ---------------- MÉTODOS PARA AGREGAR ----------------

    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void addImage(Media image) {
        if (image.isImage())
            images.add(image);
    }

    public void addVideo(Media video) {
        if (video.isVideo())
            videos.add(video);
    }
