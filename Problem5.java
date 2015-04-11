class Problem5 {
	public static void main(String[] args) {
		System.out.println(smallestMultiple(20));
	}
	public static long smallestMultiple(int n) {
		long i = 1;
		while (true) {
			for (int j = 3; j <= n; j++ ) {
				if (i % j != 0) {
					break;
				}
				if (j == n) {
					return i;
				}
			}
			i++;
		}
	}
}