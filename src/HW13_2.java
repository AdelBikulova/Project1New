public class HW13_2 {


    /*Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
        Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
        */
    public static void main(String[] args) {

        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits [" + i + "] = " + fruits[i]);
        }
        System.out.println();

        for (int i = 0; i < fruits.length; i += 2) {
            System.out.println("fruits [" + i + "] = " + fruits[i]);
        }
    }
}
