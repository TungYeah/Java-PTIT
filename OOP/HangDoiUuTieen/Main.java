package OOP.HangDoiUuTieen;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<String> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            events.add(sc.nextLine());
        }

        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
