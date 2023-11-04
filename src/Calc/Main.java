
package Calc;
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        System.out.println("Привет введите выражение для вычисления от 1 до 10  включительно");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Результат: " + calc(input));
    }

    public static int calc(String input) {
        String[] elements = input.split(" ");
        int result = 0;
        if (elements.length != 3) //проверка на количество элементов,  среди которых знак операыии
            System.out.println("Exception: Некорректная длинна примера  ");
        else {
            int num1 = numBers(elements[0]);
            int num2 = numBers(elements[2]);
            String oper = elements[1];
            result = vichMat(num1, num2, oper);
        }
        return result;
    }

    static int numBers(String s) {
        int num = 0;
        try {
            num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.print("Exception: ");
        }
        return num;
    }
    static int vichMat(int a, int b, String znak) {
        int oper = 0;
        if (a > 10 || a < 1 || b > 10 || b < 1) {   // проверка на  диапазон чисел
            System.out.println("Некорректное число или число вне диапазона");
        } else {
            switch (znak) {
                case "+":
                    oper = a + b;
                    break;
                case "-":
                    oper = a - b;
                    break;
                case "*":
                    oper = a * b;
                    break;
                case "/":
                    oper = a / b;
                    break;
                default:

                    System.out.println("Exception ввели недопустимое действие");
            }
        }
        return oper;
    }
}

