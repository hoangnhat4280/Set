package TH;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("thanh", 30, "BN");
        Student student1 = new Student("Hung", 24, "HN");
        Student student2 = new Student("Nhat", 21, "HN");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);

        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);

        System.out.println("So sanh theo tuoi");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
