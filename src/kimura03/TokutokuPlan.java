package kimura03;

public class TokutokuPlan implements Plan {
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
	
	public TokutokuPlan(double used){
		base = 6000;
		noCharge = 4000;
		chargePerMinute = 25;
		usedMinute = used;
	}
}
