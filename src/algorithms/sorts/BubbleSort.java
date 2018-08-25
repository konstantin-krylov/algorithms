package algorithms.sorts;

public class BubbleSort {
	private int[] input;
	private String[] inputString;

	public BubbleSort(int[] input) {
		this.input = input;
	}

	public BubbleSort(String[] input) {
		this.inputString = input;
	}

	// СОРТИРОВКА МАССИВА INT
	public static int[] bubbleSort(int[] input) {
		boolean notSorted = true;
		// пока массив не отсортирован, повторяем:
		while (notSorted) {
			// делаем предположение, что неправильных пар нет
			notSorted = false;
			// ищем смежные элементы массива, стоящие в неправильном порядке
			for (int i = 1; i < input.length; i++) {
				// если находим элементы в неправильном положении
				if (input[i] < input[i - 1]) {
					// меняем их местами:
					int temp = input[i];
					input[i] = input[i - 1];
					input[i - 1] = temp;
					// значит массив не отсортирован и нужно повторять действия
					notSorted = true;
				}
			}
		}
		return input;
	}
	// СОРТИРОВКА МАССИВА INT ВТОРОЙ СПОСОБ
	public static int[] bubbleSortInt(int[] input) {
		for (int i = input.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (input[j] > input[j + 1]) {
					int tmp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = tmp;
				}
			}
		}
		return input;
	}

	// СОРТИРОВКА МАССИВА СТРОК
	public static String[] bubbleSort(String[] input) {
		for (int i = input.length - 1; i >= 0; i--)
			for (int j = 0; j < i; j++)
				if (input[j].compareTo(input[j + 1]) > 0) {
					String tmp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = tmp;
				}
		return input;
	}

}
