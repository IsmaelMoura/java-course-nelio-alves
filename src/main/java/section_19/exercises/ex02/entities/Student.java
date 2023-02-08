package section_19.exercises.ex02.entities;

import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparable<Student> {
    private final Integer ID;
    private Set<Course> courses = new TreeSet<>();

    public Student(Integer ID) {
        this.ID = ID;
    }

    public Student(Integer ID, Set<Course> courses) {
        this.ID = ID;
        this.courses = courses;
    }

    public Integer getID() {
        return ID;
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

    @Override
    public int compareTo(@NotNull Student o) {
        return getID().compareTo(o.getID());
    }
}
