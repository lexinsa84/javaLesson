package homework5.task1;

import java.util.*;

public class StudentDirectory {
    private Map<String, Student> studentMap = new TreeMap<>();
    private int currentId = 1;

    public void addStudent(String name, int grade) {
        if (studentMap.containsKey(name)) {
            Student student = studentMap.get(name);
            student.addGrade(grade);
        } else {
            Student newStudent = new Student(currentId++, name);
            newStudent.addGrade(grade);
            studentMap.put(name, newStudent);
        }
    }

    public List<Integer> findStudent(String name) {
        if (studentMap.containsKey(name)) {
            return studentMap.get(name).getGrades();
        }
        return Collections.emptyList();
    }

    public Map<String, List<Integer>> getAllStudents() {
        Map<String, List<Integer>> result = new HashMap<>();
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            result.put(entry.getKey(), entry.getValue().getGrades());
        }
        return result;
    }

    public void removeStudent(String name) {
        studentMap.remove(name);
    }
}
