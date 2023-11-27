 public class HW13_3 {


   /* Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
    public static int findMin(int[] ints)

    */

     public static void main(String[] args) {
         int[] array = {5, 2, 8, 0, 1, 45};
         int min= findMin(array);
         System.out.println("The minimum element of the array is " + min);
     }

     public static int findMin(int[] ints) {
         int min = ints[0];

         for (int i = 1; i < ints.length; i++) {
             if (ints[i] < min) {
                 min = ints[i];
             }
         }
         return min;
     }
}
