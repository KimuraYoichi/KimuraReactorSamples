package kimura02;

public class Payment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		User tanaka = new User("tanaka", new RakurakuPlan(35));
		User suzuki = new User("suzuki", new RakurakuPlan(55.5));
		User katou = new User("katou", new TokutokuPlan(200));
		tanaka.printPayment();
		suzuki.printPayment();
		katou.printPayment();

	}

}
