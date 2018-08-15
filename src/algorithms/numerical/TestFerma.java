package algorithms.numerical;

public class TestFerma {
	static boolean prime;

	public static boolean isPrime(int p, int maxTests) {
		// ПРОВЕРКА НА ПРОСТОТУ
		//ВЕРОЯТНОСТНЫЙ АЛГОРИТМ
		for (int i = 1; i < maxTests; i++) {
			int n = 2 + (int)(Math.random() * (p - 1)); // Min + (int)(Math.random() * ((Max - Min) + 1))

			if (Math.pow(n, p - 1) % p != 1) {
				prime = false;
			} else
				prime = true;
		}
		return prime;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(19, 100));
	}

}
// ПРОСТЫЕ ЧИСЛА 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97...