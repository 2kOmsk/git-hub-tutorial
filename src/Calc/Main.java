package Calc;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Привет введите выражение для вычисления от 1 до 10  включительно");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Результат: " + calc(input));
    }
    public static String calc (String input) {
        String[] elements = input.split(" ");
        int a = Integer.parseInt(elements[0]);
        String oper = elements[1];
        int b = Integer.parseInt(elements[2]);
        int res = 0;
        if (a > 10 | a < 1 | b > 10 | b < 1) {
            System.out.println("Вы ввели число вне диапазона");
        } else {
            switch (oper) {
                case "+":
                    res = a + b;
                    break;
                case "-":
                    res = a - b;
                    break;
                case "*":
                    res = a * b;
                    break;
                case "/":
                    res = a / b;
                    break;
                default:
                    System.out.println("Exception ввели недопустимое действие");
            }
        }
        return Integer.toString(res);
    }
}
