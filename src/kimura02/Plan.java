package kimura02;

public class Plan {
	protected int base, noCharge, chargePerMinute;
	protected double usedMinute;
	public int charge(){
		int sum;
		double chouka = chargePerMinute * usedMinute - noCharge;
		if (chouka < 0) sum = base;
		else sum = (int)(base + chouka);
		return sum;
	}

}
