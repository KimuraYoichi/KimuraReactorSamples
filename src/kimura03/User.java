package kimura03;

import kimura03.Plan;

public class User {
	private String name;
	private Plan plan;
	public User(String n, Plan p){
		name = n;
		plan = p;
	}
	public void printPayment(){
		System.out.println("kimura03 " + name + "さんの今月の支払額は" + plan.charge() + "円です");
	}
}
