package OOP.HangDoiUuTieen;

import java.util.*;

public class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }

                int nameCompare = s1.getName().compareTo(s2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {

                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student student = new Student(name, cgpa, id);
                queue.add(student);
            } else if (parts[0].equals("SERVED")) {
                queue.poll();
            }
        }

        List<Student> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }
        return result;
    }
}