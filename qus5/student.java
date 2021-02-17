
public class student {

    double score, age;
    String first_name, last_name;


	public student(double score, double age, String first_name, String last_name) {
        this.score = score;
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
    }

	@Override
    public String toString() {
        return "[score=" + score + ", age=" + age + ", first_name=" + first_name + ", last_name=" + last_name + "]" ;
    }
}