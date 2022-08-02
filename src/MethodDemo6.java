
public class MethodDemo6 {

	public static void main(String[] args) {
		int [] array = new int [] {5, 9};
		System.out.println("Before swap: a = "+array[0]+", b = "+array[1]);
		swap(array);
		System.out.println("Before swap: a = "+array[0]+", b = "+array[1]);
	}
	static void swap(int[] array) {   // call by reference
		System.out.println("In method, Before swap: c = "+array[0]+", d = "+array[1]);
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		System.out.println("In method, After swap: c = "+array[0]+", d = "+array[1]);
	}

}
