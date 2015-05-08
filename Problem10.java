class Problem10 {
	public static void main(String[] args) {
		int max = 2000000;
		long start = System.currentTimeMillis();
		System.out.println(methodOne((long)max));
		long s1 = System.currentTimeMillis();
		System.out.println("Execution time:" + (s1-start));
		System.out.println(methodTwo(max));
		long s2 = System.currentTimeMillis();
		System.out.println("Execution time:" + (s2-s1));

	}

	public static long methodOne(long max) {
		long sum = 2;
		for (long i = 3L; i < max; i+=2) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static long methodTwo(int max) {
		boolean[] sieve = sieveOfEratosthenes(max);
		long sum = 2;
		for (int i = 3; i < sieve.length;i+=2) {
			if (sieve[i]) {
				sum += i;
			}
		}
		return sum;
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

	public static boolean[] sieveOfEratosthenes(int max) {
		boolean[] flags = new boolean[max+1];

		for (int i = 0; i < flags.length; i++) {
			flags[i] = true;
		}

		int currentPrime = 2;
		while (currentPrime <= Math.sqrt(max)) {
			for (int i = currentPrime*currentPrime; i < flags.length; i+=currentPrime) {
				flags[i] = false;
			}
			currentPrime = getNextPrime(flags,currentPrime);
		}
		return flags;
	}

	public static int getNextPrime(boolean[] flags, int currentPrime) {
		int nextPrime = currentPrime+1;
		while(nextPrime < flags.length && !flags[nextPrime]) {
			nextPrime++;
		}
		return nextPrime;
	}
}