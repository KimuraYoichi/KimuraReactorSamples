package kimuraAbstract;

public abstract class SuperClass {
	int price = 100;
	void show (int taxprice){
		System.out.println(taxprice + "円です。");
	}
	abstract void calculate();
}

// abstract 