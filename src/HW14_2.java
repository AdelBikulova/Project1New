public class HW14_2 {

    /*
    Есть массив целых чисел. Написать метод, находящий и возвращающий количество
    четных чисел в этом массиве.
    Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
     */

    public static void main(String[] args) {

        int[] array = {1, 2, 8, 7, 9, 12, 15, 13, 18, 25, 38};
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }

        System.out.println("The even numbers: " + even);
    }
}
