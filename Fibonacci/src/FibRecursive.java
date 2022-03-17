import java.util.Scanner;

/**
 * 
 */

/**
 * @author angelamcelwee
 *
 */
public class FibRecursive {

	static int Fibonacci(int n) {
		if (n <= 1)
			return n;
		
		return Fibonacci(n-1) + Fibonacci(n-2);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		//collecting the nth sequence number from the user
		try (Scanner num = new Scanner(System.in)) {
			//asking the question
			System.out.println ("Enter Fibonacci sequence number to print all values up to that sequence number");
			//accepting the input
			int in = num.nextInt();
			//setting the pass value equal to the input value
			n = in;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(Fibonacci(i) + " ");
		}
	}

}
