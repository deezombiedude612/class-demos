package Lecture11;

public class TestException {
	public static void main(String[] args) {
		try {
			System.out.println(sum(new int[] { 1, 2, 3, 4, 5 } ));
		} catch (Exception ex) {
//			ex.printStackTrace();
			System.out.println("\n" + ex.getMessage());
			System.out.println("\n" + ex.toString());
		}
	}

	private static int sum(int[] list) {
		int result = 0;
		for (int i = 0; i <= list.length; i++)
			result += list[i];
		return result;
	}
}
