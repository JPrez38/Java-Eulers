class Problem9 {
	public static void main(String[] args) {
		for (int a = 0; a < 334; a++) {
			for (int b = a; b < 334+a;b++) {
				int c = 1000-a-b;
				if ((a*a + b*b) == c*c) {
					System.out.println(a*b*c);
				}
			}
		}
	}
}