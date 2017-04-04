package kimura01;

public class Payment {
	public static void main(String[] args){
		charge("tanaka",1,35);
		charge("suzuki",1,55.5);
		charge("katou",2,200);
		charge("hayashi",2,400);
		charge("kimura",1,2000);
	}
	static void charge(String name, int plan, double usedMinute){
		int sum = 0;
		if (plan == 1){
			double chouka = 40 * usedMinute - 2000;
			if (chouka < 0) sum = 4000;
			else sum = (int)(4000 + chouka);
		} else if (plan == 2){
			double chouka = 25 * usedMinute - 4000;
			if (chouka <0 ) sum = 6000;
			else sum = (int)(60000 + chouka);
		}
		System.out.println("kimura01 " + name + "さんの今月の支払額は" + sum + "円です");
	}
}
