public class ArgsDemo {
	public static void main(String[] args) {
		System.out.println("args size: " + args.length);

		for (int i = 0; i < args.length; ++i)
			System.out.println("argc[" + i + "]: " + args[i]);
	}
}
