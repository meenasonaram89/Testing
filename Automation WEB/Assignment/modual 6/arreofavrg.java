package assignment;

public class arreofavrg {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for (int i = 1; i <= 500; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
				num++;
			}
		}
		int avg = sum / num;
		System.out.println("avg" + avg);
	}

}
