package section_19.exercises.ex02.entities;

import org.jetbrains.annotations.NotNull;

import java.util.Set;
import java.util.TreeSet;

public class Course implements Comparable<Course> {
    private String name;
    private Set<Student> students = new TreeSet<>();

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public int compareTo(@NotNull Course o) {
        return name.compareTo(o.getName());
    }
}
