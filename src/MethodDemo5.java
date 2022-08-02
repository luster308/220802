
public class MethodDemo5 {

	public static void main(String[] args) {
		int a = 5, b = 9;
		System.out.println("Before swap: a = "+a+", b = "+b);
		swap(a, b);
		System.out.println("Before swap: a = "+a+", b = "+b);
	}
	static void swap(int c, int d) {
		System.out.println("In method, Before swap: c = "+c+", d = "+d);
		int temp = c;
		c = d;
		d = temp;
		System.out.println("In method, After swap: c = "+c+", d = "+d);   // 값복사는 스와핑이 안된다.
	}

}
