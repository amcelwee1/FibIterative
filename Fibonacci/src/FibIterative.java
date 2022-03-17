
/**
 * @author angelamcelwee
 *
 */

import java.util.Scanner; //import Scanner Class to collect nth number from user

public class FibIterative {

	//iterative while loop to calculate Fibonacci value for sequence number
	static void Fibonacci(int n) {
		//hardcoding first two values in the sequence
		int val1 = 0;
		int val2 = 1;
		//setting the sequence value to one to start the process
		int sequence = 1;
		
		while (sequence <= n) {
			//as long as the scanner value is greater than or equal to the current sequence number keep going through loop
			//and printing out the value in val1
			System.out.print(val1 + " ");
			
			//setting the next value
			int val3 = val1 + val2;
			//swapping old values for new values
			val1 = val2;
			val2 = val3;
			//adding 1 to the sequence to get to the next number in the sequence
			sequence = sequence + 1;
		}
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
		//passing the value to the fibonacci function
		Fibonacci(n);
		
	}

}
