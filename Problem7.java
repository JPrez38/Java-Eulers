class Problem7 {
	public static void main(String[] args) {
		int totalPrimes = 10001;
		long highestPrime = 0;
		int primeCount = 1;
		long i = 3;
		while (primeCount < totalPrimes) {
			if (isPrime(i)) {
				primeCount++;
				highestPrime = i;
			}
			i+=2;
		}
		System.out.println(highestPrime);
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