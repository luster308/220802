
public class MethodDemo {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");
		MethodDemo md = new MethodDemo();
		md.makeSum();
		md.makeSum();
		System.out.println("Program is Over...");

	}
	// 메소드 3요소: 메소드 이름, 괄호(), 리턴 타입
	void makeSum() {   // call by name
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("Method is Over");
	}
}
