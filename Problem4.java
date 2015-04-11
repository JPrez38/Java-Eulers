class Problem4 {
	public static void main(String[] args) {
		int max = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (isPalindrome(i*j) && i*j > max) {
					max = i*j;
				}
			}
		}
		System.out.println(max);

	}

	public static boolean isPalindrome(long n) {
		String numberString = Long.toString(n);
		for (int i = 0; i < numberString.length()/2; i++) {
			if (numberString.charAt(i) != numberString.charAt(numberString.length() - 1-i)) {
				return false;
			}
		}
		return true;
	}
}