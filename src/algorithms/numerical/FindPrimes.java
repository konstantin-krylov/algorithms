package algorithms.numerical;

import java.util.ArrayList;
import java.util.List;

public class FindPrimes {
	// НАХОЖДЕНИЕ ПРОСТЫХ ЭЛЕМЕНТОВ
	//Решето Эрастосфена
	public static List<Integer> findPrimes(int maxNumber) {
		// МАССИВ ДЛЯ СОСТАВНЫХ ЧИСЕЛ
		boolean[] isComposite = new boolean[maxNumber + 1];

		// НАХОДИМ ПРОСТЫЕ ЧИСЛА МЕЖДУ 2 и maxNumber
		// ИСКЛЮЧАЕМ ЧИСЛА, КРАТНЫЕ 2 (2 НЕ ИСКЛЮЧАЕМ)
		for (int i = 4; i < maxNumber; i += 2) {
			isComposite[i] = true;
		}

		// ИСКЛЮЧАЕМ ЧИСЛА, КРАТНЫЕ НАЙДЕННЫМ ПРОСТЫМ ЧИСЛАМ
		int nextPrime = 3;
		int stopAt = (int) Math.sqrt(maxNumber);
		while (nextPrime <= stopAt) {

			// ИСКЛЮЧАЕМ ЧИСЛА, КРАТНЫЕ ДАННОМУ ПРОСТОМУ ЧИЛУ
			for (int j = nextPrime * 2; j < maxNumber; j += nextPrime) {
				isComposite[j] = true;
			}

			// ПЕРЕХОД К СЛЕДУЮЩЕМУ ПРОСТОМУ ЧИСЛУ, ПРОПУСКАЯ ЧЕТНЫЕ ЧИСЛА
			nextPrime += 2 ;

			while ((nextPrime <= maxNumber) && (isComposite[nextPrime])) {
				nextPrime += 2;
			}
		}

		// ЗАНОСИМ ПРОСТЫЕ ЧИСЛА В СПИСОК
		List<Integer> primes = new ArrayList<>();
		for (int k = 2; k < maxNumber; k++) {
			if (!isComposite[k]) {
				primes.add(k);
			}
		}

		return primes;
	}

	public static void main(String[] args) {
		System.out.println(findPrimes(123));
	}
}
