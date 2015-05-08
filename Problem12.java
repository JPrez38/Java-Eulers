import java.util.ArrayList;

public class Problem12{
	static ArrayList<Long> triangles = new ArrayList<Long>(1000000);
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i = 0;
		while(numberOfDivisors(nextTriangle(i)) < 500) {
			i++;
		}

		long end = System.currentTimeMillis();

		System.out.println(nextTriangle(i));
		System.out.println("Execution time:" + (end-start));

	}

	public static long nextTriangle(int n) {
		if (!triangles.isEmpty()) {
			long currentTriangle = triangles.get(n-1) + n;
			triangles.add(n,currentTriangle);
			return currentTriangle;
		} else if (n < 1) {
			triangles.add(n,(long)n);
			return n;
		} else {
			long next = nextTriangle(n-1) + n;
			triangles.add(n,next);
			return next;
		}
	}

	public static int numberOfDivisors(long n) {
		int count = 0;
		for (long i = 1L; i*i <= n; i++) {
			if (n % i == 0) {
				if (i*i < n) {
					count += 2;
				} else {
					count += 1;
				}
			} 
		}
		return count;
	}
}