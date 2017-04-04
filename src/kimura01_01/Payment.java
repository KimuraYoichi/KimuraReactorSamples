package kimura01_01;

public class Payment {
	public static void main(String[] args){
		Charge tanaka = new Charge("tanaka",1,35);
		Charge suzuki = new Charge("suzuki",1,55.5);
		Charge katou  = new Charge("katou",2,200);
		Charge kim = new Charge("kimura",2,2000);
		tanaka.charge();
		suzuki.charge();
		katou.charge();
		kim.charge();

	}
}
