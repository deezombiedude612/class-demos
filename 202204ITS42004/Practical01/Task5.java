package Practical01;

public class Task5 {
	public static void main(String[] args) {
		long totalMillseconds = System.currentTimeMillis();
//		System.out.println("Milliseconds: " + totalMillseconds + "\n");

		long totalSeconds = totalMillseconds / 1000;
		long currentSecond = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		System.out.println("Hours: " + totalHours + "\n");
//		long currentHour = totalHours % 24;
		long currentHour = (totalHours + 8) % 24;   // for Malaysian time (UTC +8)

//		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
		System.out.printf("Current time is %02d:%02d:%02d", currentHour, currentMinute, currentSecond);
	}
}
