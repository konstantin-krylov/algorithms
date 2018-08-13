package com.algorithm;

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

	public static void main(String[] args) {
		FindFactors factors = new FindFactors();
		int input = 265;
		if (factors.findFactors(input).size() == 1)
			System.out.println(input + " - простое число");
		else
			System.out.println(factors.findFactors(input));
	}

}
