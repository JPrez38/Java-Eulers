class Problem10 {
	public static void main(String[] args) {
		long sum = 2;
		for (long i = 3L; i < 2000000L; i+=2) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
	public static boolean isPrime(long n) {
		if (n != 2L && n % 2L == 0L) { return false; }

		long sqrt = Math.round(Math.sqrt(n))+1L;
		for (long i = 3L; i < sqrt; i += 2L) {
			if (n % i == 0L) {
				return false;
			}
		}
		return true;
	}
}