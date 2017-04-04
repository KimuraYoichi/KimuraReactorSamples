package kimuraComposite;

public class Student extends Person {
	private int grade;
	public Student(String n, int a, int g){ super(n,a); grade = g;}
	public int getGrade(){return grade;}
}
