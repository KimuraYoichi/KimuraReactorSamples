package kimura04;

public class RakurakuPlan extends PlainPlan {
	public RakurakuPlan(double used){
		base = 4000;
		noCharge = 2000;
		chargePerMinute = 40;
		usedMinute = used;
	}
}
