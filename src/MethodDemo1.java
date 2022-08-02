
public class MethodDemo1 {
	public static void main(String[] args) {
		System.out.println("Program is Starting...");
		MethodDemo1 md = new MethodDemo1();
		int start = 1, last = 100;
		int result = md.makeSum(start, last);
		System.out.println(start+"부터 "+last+"까지의 합은 "+result);
		start = 30;	last=50;
		result = md.makeSum(start, last);
		System.out.println(start+"부터 "+last+"까지의 합은 "+result);
		System.out.println("Program is Over...");

	}
	// 메소드 3요소: 메소드 이름, 괄호(), 리턴 타입
	int makeSum(int start, int last) {   // call by value(값복사)
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println("Method is Over");
		return sum;
	}
}
