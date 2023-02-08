package section_19.exercises.ex02.application;

import section_19.exercises.ex02.entities.Course;
import section_19.exercises.ex02.entities.Instructor;
import section_19.exercises.ex02.entities.Student;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Set<Course> courses = new TreeSet<>();
            courses.add(new Course("A"));
            courses.add(new Course("B"));
            courses.add(new Course("C"));

            for (Course course : courses) {
                System.out.print("How many students for course " + course.getName() + "? ");
                int students = scanner.nextInt();

                for (int i = 0; i < students; i++) {
                    System.out.print(course.getName() + ", Student ID: ");
                    int studantID = scanner.nextInt();
                    course.addStudent(new Student(studantID, Set.of(course)));
                }
            }

            Instructor instructor = new Instructor("Alex", courses);

            System.out.println(instructor.getName() + " have " + instructor.getStudents().size() + " students.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
