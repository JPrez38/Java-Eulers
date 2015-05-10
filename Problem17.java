public class Problem17 {
	static int[] ones = new int[]{0,3,3,5,4,4,3,5,5,4,3,6,6,8,8,7,7,9,8,8};
	static int[] tens = new int[]{0,3,6,6,5,5,5,7,6,6};
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			sum += letterCount(i);
		}
		long end = System.currentTimeMillis();;
		System.out.println(sum);
		System.out.println("Execution time: " + (end-start));
	}

	public static int letterCount(int n) {
		int chars = 0;
		if (n < 20) {
				chars += ones[n];
			} else if (n >= 20 && n < 100) {
				chars += tens[n/10];
				chars += ones[n%10];
			} else if (n >= 100 && n < 1000) {
				chars += ones[n/100];
				chars += 7;
				if (n % 100 > 0) {
					chars += 3;
					chars += letterCount(n%100);
				}
			} else {
				chars += 11;
			}
			return chars;
	}
}