public class Problem19 {
	static int[] daysInMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		System.out.println(numberOfSundays(new int[]{1,0,1901},new int[]{31,11,2000}));

		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end-start));
	}

	public static int numberOfSundays(int[] minDate, int[] maxDate) {
		int sundayCount = 0;		
		try {
			int dayOfWeek = 1;
			
			int[] currentDate = new int[] {1,0,1900};
			while (smallerThan(currentDate,maxDate)) {
				if (smallerThan(minDate,currentDate)) {
					if (dayOfWeek == 0 && currentDate[0]==1) {
						sundayCount++;
					}
				}
				dayOfWeek = (dayOfWeek+1)%7;
				currentDate[0]++;
				if (currentDate[0] > daysInMonth[currentDate[1]]) {
					if (currentDate[1] != 1 || !(isLeapYear(currentDate) && currentDate[0] < 30)) {
						currentDate[1]++;
						currentDate[0] = 1;
					} 
				} 
				if (currentDate[1] > 11) {
					currentDate[2]++;
					currentDate[1] = 0;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sundayCount;
	}

	public static boolean isLeapYear(int[] currentDate) {
		if (currentDate[2] % 4 == 0 && (currentDate[2] % 100 != 0 || currentDate[2] % 400 == 0)){
			return true;
		} else {
			return false;
		}
	}

	public static boolean smallerThan(int[] targetDate,int[] maxDate) throws Exception {
		if (targetDate.length != maxDate.length) {
			throw new Exception();
		}
		for (int i = maxDate.length-1; i >=0; i--) {
			if (maxDate[i] > targetDate[i]) {
				return true;
			}
			if (maxDate[i] < targetDate[i]) {
				return false;
			}
		}
		return true;
	}
}