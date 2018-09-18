package algorithms.sorts;

public class Task {
    public static void main(String[] args) {

        /*
        first и second – массивы, которые надо слить;
        a3 – результирующий массив;
        i и j – индексы для массивов first и second соответственно, которые указывают на текущие элементы на каждом шаге и образуют тот самый буфер.

        Первые два условия проверяют, что бы индексы не вышли за переделы количества элементов в массивах. Третье и четвертое условия
        обеспечивают перемещение в массив наименьшего элемента из первого массива и из второго соответственно.

         */
        int[] a1 = new int[]{21, 23, 24, 40, 75, 76, 78, 77, 900, 2100, 2200, 2300, 2400, 2500};
        int[] a2 = new int[]{10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] result = new int[a1.length + a2.length];

        int countFirst = 0, countSecond = 0;
        for (int index = 0; index < result.length; index++) {

            if (countFirst > a1.length - 1) {
                int tmp = a2[countSecond];
                result[index] = tmp;
                countSecond++;
            } else if (countSecond > a2.length - 1) {
                int tmp = a1[countFirst];
                result[index] = tmp;
                countFirst++;
            } else if (a1[countFirst] < a2[countSecond]) {
                int tmp = a1[countFirst];
                result[index] = tmp;
                countFirst++;
            } else {
                int b = a2[countSecond];
                result[index] = b;
                countSecond++;
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
