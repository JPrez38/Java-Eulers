class Problem3 {
	public static void main(String[] args) {
		long sum = 0L;

		long num = 600851475143L;

		System.out.println(findLargestPrimeFactor(num));
	}

	public static long findLargestPrimeFactor(long n) {
		long maxPrime = 0L;
		for (long i = 2L; i <= n;) {
			if (n %i == 0L  && isPrime(i)) {
				maxPrime = i;
				System.out.println(i);
				n/=i;
			} 
			i++; 
		}
		return maxPrime;
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