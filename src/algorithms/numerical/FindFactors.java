package algorithms.numerical;

import java.util.ArrayList;
import java.util.List;

public class FindFactors {
	// НАХОЖДЕНИЕ ПРОСТЫХ МНОЖИТЕЛЕЙ

	public List<Integer> findFactors(int input) {
		List<Integer> list = new ArrayList<>();
		int i = 2;
		while (i < input) {
			// проверяем делимость на i
			while (input % i == 0) {
				// значит i является множителем. Добавляем в список
				list.add(i);
				input = input / i;
			}
			i++;

		}
		if (input > 1) {
			list.add(input);
		}
		return list;
	}

	// МОДЕРНИЗИРОВАННЫЙ МЕТОД свременем работы O(sqrt(N))
	public List<Integer> findFactorsAdvansed(int input) {
		List<Integer> list = new ArrayList<>();
		while (input % 2 == 0) {
			list.add(2);
			input = input / 2;
		}
		// Ищем нечетные множители
		int i = 3;
		int maxFactor = (int) Math.sqrt(input);
		while (i <= maxFactor) {
			while (input % i == 0) {
				list.add(i);
				input = input / i;
			}
			i = i + 2;
		}
		if (input > 1)
			list.add(input);

		return list;
	}

	public static void main(String[] args) {
		FindFactors factors = new FindFactors();
		int input = 1586745288;
		if (factors.findFactorsAdvansed(input).size() == 1)
			System.out.println(input + " - простое число");
		else
			System.out.println(factors.findFactorsAdvansed(input));
	}

}
