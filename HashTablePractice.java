import java.util.HashMap;

public class HashTablePractice {

    public static class Student {
        private int id;
        private String name;
        private double gpa;

        public Student(int id, String name, double gpa) {
            this.id = id;
            this.name = name;
            this.gpa = gpa;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getGpa() {
            return gpa;
        }
    }

    public static HashMap<Integer, Student> buildMap(Student[] students) {
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for (Student s : students) map.put(s.getId(), s);
        return map;
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, "John", 3.5);
        students[1] = new Student(2, "Jane", 3.8);
        students[2] = new Student(3, "Doe", 3.2);
        students[3] = new Student(4, "Smith", 3.9);
        students[4] = new Student(5, "Johnson", 3.6);

        HashMap<Integer, Student> map = buildMap(students);
        System.out.println(map.get(1).getName());
    }
}
