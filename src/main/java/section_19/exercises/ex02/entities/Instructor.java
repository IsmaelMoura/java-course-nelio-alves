package section_19.exercises.ex02.entities;

import java.util.Set;
import java.util.TreeSet;

public class Instructor {
    private String name;
    private final Set<Course> courses;
    private final Set<Student> students = new TreeSet<>();

    public Instructor(String name, Set<Course> courses) {
        this.name = name;
        this.courses = courses;
        for (Course course : courses) {
            this.students.addAll(course.getStudents());
        }
    }

    public Set<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }
}
