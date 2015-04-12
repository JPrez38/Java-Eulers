class Problem6 {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(squareOfSums(n) - sumOfSquares(n));
	}

	public static long squareOfSums(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return (long)(sum*sum);
	}

	public static long sumOfSquares(int n) {
		long sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += (long)(i*i);
		}
		return sum;
	}
}
