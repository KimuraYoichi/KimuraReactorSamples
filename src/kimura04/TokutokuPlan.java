package kimura04;

public class TokutokuPlan extends PlainPlan {
	public TokutokuPlan(double used){
		base = 6000;
		noCharge = 4000;
		chargePerMinute = 25;
		usedMinute = used;
	}
}
