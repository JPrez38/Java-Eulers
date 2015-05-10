import java.math.BigInteger;

public class Problem20 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		String bigNum = factorial(100).toString();
		long count = 0;
		for (int i = 0; i < bigNum.length();i++) {
			count += Character.getNumericValue(bigNum.charAt(i));
		}

		System.out.println(count);
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start));
	}

	public static BigInteger factorial(int n) {
		BigInteger n1 = BigInteger.ONE;
		for (int i = n; i > 0; i--) {
			n1 = n1.multiply(BigInteger.valueOf(i));
		}
		return n1;
	}
}