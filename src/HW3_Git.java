public class HW3_Git {

/*Написать метод, считающий площадь круга и возвращающий это значение в основную программу.
 Формула для расчета площади area = pi* radius * radius
Значение радиуса должно передаваться как аргумент метода.
Затем, в методе main вывести полученное значение на экран
        */

    public static void main(String[] args) {

        double radius = 8;
        double area = areaCircle(radius);
        System.out.println( "Area is: " + area);

    }
    static double areaCircle (double radius) {

        double pi = 3.14;
        double area = 3.14 * (radius * radius);
        return area;

    }


}
