
public class MethodDemo4_1 {
public static void main(String[] args) {
	int original = 5;
	System.out.println("Before calling method, original = "+original);
	mymethod(original);
	System.out.println("After calling method, original = "+original);
}
	static void mymethod(int target) {   // int target = original
		System.out.println("In method, target = "+target);
		target = 100;
		System.out.println("In method, target = "+target);
	}
}

//Before calling method, original = 5
//In method, target = 5
//In method, target = 100
//After calling method, original = 5
//값복사는 안에서만 바뀌고 돌아가서는 바뀌지 않는다.