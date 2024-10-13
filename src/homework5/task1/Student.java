package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private List<Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void updateGrade(int grade) {
        if (!grades.isEmpty()) {
            grades.set(grades.size() - 1, grade);
        } else {
            addGrade(grade);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name) && grades.equals(student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, grades);
    }
}
