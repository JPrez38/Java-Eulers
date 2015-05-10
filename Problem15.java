import java.math.BigInteger;

public class Problem15 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(getBetterLatticePaths(20));
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start));
	}

	public static int getLatticePaths(int x , int y) {
		if (x == 0 && y == 0) {
			return 0;
		} else if (x < 1) {
			return 1;
		} else if (y < 1) {
			return 1;
		} else {
			int count =  0;
			count += getLatticePaths(x-1,y);
			count += getLatticePaths(x,y-1);
			return count;
		}
	}

	public static BigInteger getBetterLatticePaths(int x) {
		int n = x*2;
		return (factorial(n).divide(factorial(n-x).multiply(factorial(x))));	
	}

	public static BigInteger factorial(int num) {
		BigInteger n = BigInteger.ONE;
		for (int i = 1; i <= num; i++) {
			n = n.multiply(BigInteger.valueOf(i));
		}
		return n;
	}
}