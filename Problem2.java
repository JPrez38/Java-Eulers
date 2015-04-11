class Problem2 {
	public static void main(String[] args) {
		long sum = 0L;

		long i = 0L;
		long nextFib = 0L;
		while (nextFib < 4000000L) {
			i++;
			nextFib = fib(i);
			if (nextFib % 2L == 0L) {
				sum += nextFib;
			}

		}

		System.out.println(sum);


	}

	public static long fib(long n) {
		if (n == 0L || n == 1L) {
			return 1L;
		} else {
			return (fib(n-1L) + fib(n-2L));
		}
	}
}