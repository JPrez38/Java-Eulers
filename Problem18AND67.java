import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class Problem18AND67 {
	public static void main(String[] args) {
		long start = 0;
		try {
			if (args.length == 2) {
				start = System.currentTimeMillis();
				int [][] triangle = constructTriangle(args[0],Integer.parseInt(args[1]));
				System.out.println(maxPath(triangle));
			} else {
				Scanner in = new Scanner(System.in);
				System.out.println("Please specify a file: ");
				String file = in.next();
				System.out.println("Please specify the max depth");
				int depth = in.nextInt();
				start = System.currentTimeMillis();
				int [][] triangle = constructTriangle(file,depth);
				System.out.println(maxPath(triangle));
			}
			
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		long end = System.currentTimeMillis();
		System.out.println("Computation execution Time: " + (end-start));

	}

	public static int maxPath(int[][] triangle) {
		for (int i = triangle.length-2; i >= 0; i--) {
			for (int j = 0; j < triangle[i].length; j++) {
				triangle[i][j] += Math.max(triangle[i+1][j],triangle[i+1][j+1]);
			}
		}
		return triangle[0][0];
	}

	public static int[][] constructTriangle(String file, int depth) throws Exception {
		int[][] triangle = new int[depth][];
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String line;
		int i = 0;
		while ((line = br.readLine()) != null) {
			triangle[i] = new int[i + 1];
			int j = 0;
			Scanner nums = new Scanner(line);
			while (nums.hasNext()) {
				int value = nums.nextInt();
				triangle[i][j++] = value;
			}
			i++;
		}

		return triangle;
	}
}