package kimuraComposite;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person tanaka = new Person("tanaka", 35);
		System.out.println("Name " + tanaka.getName() + " Age " + tanaka.getAge());
		
		Student yamada = new Student("yamada", 21, 4);
		
		System.out.println("Name " + yamada.getName() + " Age " + yamada.getAge() + " Grade " + yamada.getGrade());

	}

}
