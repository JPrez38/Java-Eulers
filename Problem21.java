public class Problem21 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sum = 0;
		for (int a = 0; a < 10000; a++) {
			int b = sumProperDiv(a);
			int db = sumProperDiv(b);
			if (a != b && a == db) {
				sum += b;
			}
		}
		System.out.println(sum);
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start));
	}

	public static int sumProperDiv(int n) {
		int sum = 0;
		for (int i = 1; i*i < n; i++) {
			if (n % i == 0) {
				sum += i;
				if (n/i != n) {
					sum += n/i;
				}
			}
		}
		return sum;
	} 
}