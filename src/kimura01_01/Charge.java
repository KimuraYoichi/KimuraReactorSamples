package kimura01_01;

public class Charge{
	String name;
	int plan;
	double usedMinute;
	
	Charge(String n,int p,double used){
		name = n;
		plan = p;
		usedMinute = used;
	}
	public void charge(){
		int sum = 0;
		if (plan == 1){
			double chouka = 40 * usedMinute - 2000;
			if (chouka < 0) sum = 4000;
			else sum = (int)(4000 + chouka);
		} else if (plan == 2){
			double chouka = 25 * usedMinute - 4000;
			if (chouka <0 ) sum = 6000;
			else sum = (int)(6000 + chouka);
		}
		System.out.println("kimura01_01  " + name + "さんの今月の支払額は" + sum + "円です");
	}
}
