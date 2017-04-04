package kimura04;


public class User {
	private String name;
	private Plan plan;
	public User(String n, Plan p){
		name = n;
		plan = p;
	}
	public void printPayment(){
		System.out.println("kimura04 " + name + "さんの今月の支払額は" + plan.charge() + "円です");
	}
}
