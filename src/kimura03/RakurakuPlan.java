package kimura03;

public class RakurakuPlan implements Plan {
	protected int base, noCharge, chargePerMinute;
	protected double usedMinute;

	@Override
	public int charge() {
		// TODO 自動生成されたメソッド・スタブ
		int sum;
		double chouka = chargePerMinute * usedMinute - noCharge;
		if (chouka < 0) sum = base;
		else sum = (int)(base + chouka);
		return sum;
	}
	
	public RakurakuPlan(double used){
		base = 4000;
		noCharge = 2000;
		chargePerMinute = 40;
		usedMinute = used;
	}
}
