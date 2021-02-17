
public class employe {
    double age, salary;
    String name;

    employe(double age, double salary, String name){
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[age=" + age + ", salary=" + salary + ", name=" + name + "]" ;
    }
}