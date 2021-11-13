package lab1;

public class Demo {
	int variable = 5;
	public static void main(String args[]) {
		Demo obj = new Demo();
		obj.method(20);
		obj.method();
	}
	void method(int variable) {
		variable = 10;
		System.out.println("without using this keyword " + variable);
		System.out.println(" using this keyword " + this.variable);
	}
	void method() {
		int variable = 50;
		System.out.println("Value of variable " + variable);
	}

}
