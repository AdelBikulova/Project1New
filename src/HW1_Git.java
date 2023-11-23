import java.util.Scanner;

public class HW1_Git {


        public static void main(String[] args) {

            //Exercise1
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter your name ");
            String name = myScanner.nextLine();

            System.out.println("Enter a surname ");
            String secondName = myScanner.nextLine();

            System.out.println("The name is " + name + " " + secondName);

            System.out.println("Enter age");
            int age = myScanner.nextInt();
            System.out.println("The name is " + name + " " + secondName + ", age is " + age);

            //Exercise2
            char ch;
            ch = 'A';
            int ascii = (int) ch;
            System.out.println("A is " + ascii + " in ASCII");
            // and conversely
            char ch1;
            ch1 = 65;
            System.out.println("65 in ASCII is " + ch1);

            //Exercise3*
            int a = 1;
            int b = 2;

            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("a =  " + a + ", b = " + b );

        }


}
