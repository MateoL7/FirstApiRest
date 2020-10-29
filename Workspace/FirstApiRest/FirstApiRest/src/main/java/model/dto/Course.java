package dto;

public class Course {

    private String id;
    private String name;
    private String NRC;

    public Course(String id, String name, String NRC) {
        this.id = id;
        this.name = name;
        this.NRC = NRC;
    }

    public Course() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }
}
