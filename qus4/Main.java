import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<employe> employees = new ArrayList<>();

        employees.add(new employe(10, 70000, "Priya"));
        employees.add(new employe(20, 40000, "Tina"));
        employees.add(new employe(30, 90000, "Sameer"));
        employees.add(new employe(40, 60000, "Rahul"));

        employees.sort(new Comparator<employe>() {
            @Override
            public int compare(employe o1, employe o2) {
                return (int)(o2.salary-o1.salary);
            }
        });

        Iterator<employe> iterator = employees.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}