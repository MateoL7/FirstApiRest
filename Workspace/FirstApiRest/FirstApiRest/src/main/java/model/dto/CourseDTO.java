package dto;

public class CourseDTO {

    private String name;
    private String program;
    private TeacherDTO teacher;

    public CourseDTO() {
    }

    public CourseDTO(String name, String program, TeacherDTO teacher) {
        this.name = name;
        this.program = program;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public TeacherDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDTO teacher) {
        this.teacher = teacher;
    }
}
