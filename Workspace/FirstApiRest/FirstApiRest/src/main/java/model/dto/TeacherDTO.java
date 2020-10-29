package dto;

import java.util.ArrayList;

public class TeacherDTO {

    private int id;
    private String name;
    private String faculty;
    private ArrayList<CourseDTO> courses;

    public TeacherDTO() {
    }

    public TeacherDTO(int id,String name, String faculty, ArrayList<CourseDTO> courses) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public ArrayList<CourseDTO> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseDTO> courses) {
        this.courses = courses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
