package javaBasic2_2;

public class ThreadSleep {

	public static void main(String[] args) {

		for (int i = 1; i < 11; i = i + 1) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.printf("%d\n", i);
		}

	}

}
