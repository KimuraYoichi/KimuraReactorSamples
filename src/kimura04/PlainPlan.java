package kimura04;

public class PlainPlan implements Plan {
	protected int base, noCharge, chargePerMinute;
	protected double usedMinute;

	public int charge() {
		// TODO 自動生成されたメソッド・スタブ
		int sum;
		double chouka = chargePerMinute * usedMinute - noCharge;
		if (chouka < 0) sum = base;
		else sum = (int)(base + chouka);
		return sum;
	}

}
