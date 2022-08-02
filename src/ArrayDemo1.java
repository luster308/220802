
public class ArrayDemo1 {

	public static void main(String[] args) {
		// <<Rectangular Array>>
		//첫번째 방법
//		int [][] array;   // 선언(declaration)
//		array = new int[2][3];   //  생성(Creation)
//		array[0][0] = (int)(Math.random()*10+1);   // 할당(Assignment)
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);
//		array[1][0] = (int)(Math.random()*10+1);
//		array[1][1] = (int)(Math.random()*10+1);
//		array[1][2] = (int)(Math.random()*10+1);
		
		//두번째 방법
//		int[][] array;   // 선언
//		array = new int[][] { {3,4,5,6}, {7,8,9,10}};   // 생성&할당
		
		//세번째 방법
//		int[][] array = {
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12}
//		};
		
		// <<Ragged(Jagged) Array>>
		//첫번째 방법
//		int[][] array;   // 선언(declaration)
//		array = new int[3][];   // 생성(creation)
//		array[0] = new int[3];
//		array[1] = new int[2];
//		array[2] = new int[1];
//		array[0][0] = (int)(Math.random()*10+1);   // 할당(Assignment)
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);
//		array[1][0] = (int)(Math.random()*10+1);
//		array[1][1] = (int)(Math.random()*10+1);
//		array[2][0] = (int)(Math.random()*10+1);
		
		//두번째 방법
//		int [][] array;
//		array = new int[3][];
//		array[0] = new int[] {3,4,5,6,7,8};
//		array[1] = new int[] {9,10};
//		array[2] = new int[] {11,12,13,14};
		
		//세번째 방법
		int [][] array = {
				{3,4,5,6},
				{7,8},
				{9,10,11,12,13,14}
		};
		for(int i=0;i<array.length;i++) {
			System.out.println("array "+i+"층");
			for(int j=0;j<array[i].length;j++) {
				System.out.print("array["+i+"]["+j+"] = "+array[i][j]+"\t\t");
			}
			System.out.println();
		}
	}

}
