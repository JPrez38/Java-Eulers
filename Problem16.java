import java.math.BigInteger;

public class Problem16 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int exp = 1000;
		BigInteger bigInt = new BigInteger("2");
		String bigNum = bigInt.pow(exp).toString();
		System.out.println(sumExp(bigNum));
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start));
	}

	public static long sumExp(String s) {
		long sum = 0;
		for (int i = 0; i < s.length();i++) {
			sum += Character.getNumericValue(s.charAt(i));
		}
		return sum;
	}
}