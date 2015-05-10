import java.util.HashMap;

public class Problem14 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		long max = 0;
		long maxIndex = 0;
		for (long i = 0; i < 1000000L; i++) {
			long num = collatz(i);
			if (num > max) {
				max = num;
				maxIndex = i;
			}
		}
		System.out.println("The longest is " + maxIndex + " with length " + max);
		long end = System.currentTimeMillis();
		System.out.println("Time execution: " + (end-start));
	}

	public static long collatz(long num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			long count = 0;
			if (num % 2 == 0) {
				count = collatz(num/2);
			} else {
				count = collatz((3*num + 1));
			}
			count++;
			return count;
		}
	}

}