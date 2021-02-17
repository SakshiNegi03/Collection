import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<student> students = new ArrayList<>();

        students.add(new student(111, 40, "Sana", "Sharma"));
        students.add(new student(222, 48, "Vijay", "Sehrawat"));
        students.add(new student(333, 40, "Tina", "Khanna"));
        students.add(new student(444, 50, "Priya", "Sharma"));

        students.sort(new Comparator<student>() {
            @Override
            public int compare(student a, student b) {
                return (int)(a.score-b.score)  == 0 ? a.first_name.toLowerCase().compareTo(b.first_name.toLowerCase()) : (int)(b.score-a.score);
            }
        });

        Iterator<student> iterator = students.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}