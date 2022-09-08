package Practical01;

public class PrintTime {
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
//		System.out.println("Hours: " + totalHours + "\n");
		long currentHour = (totalHours + 8) % 24;

		System.out.printf("Current time is %02d:%02d:%02d", currentHour, currentMinute, currentSecond);
	}
}
