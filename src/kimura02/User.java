package kimura02;

public class User {
	private String name;
	private Plan plan;
	public User(String n, Plan p){
		name = n;
		plan = p;
	}
	public void printPayment(){
		System.out.println("kimura02 " + name + "さんの今月の支払額は" + plan.charge() + "円です");
	}

}
