import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		int num = in.nextInt();
		TrapRain obj = new TrapRain();
//		int[][] num1={
//		              {1,   3,  5,  7},
//		              {10, 11, 16, 20},
//		              {23, 30, 34, 50}
//		};
		int[] num1={2,0,2};
		int[] num2= {1,1};
		System.out.println(obj.trap2(num1));
	}
}
