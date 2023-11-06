// Долго, но дошло. Изучил получще  исключения так как не использовал ранее ниокгда.
// Добавил в пример  и  удалил  1  метод, вообще можно  все запихать в  1 метод
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
        int num1,num2;
        if (elements.length != 3) //проверка на количество элементов, среди которых знак операыии
            throw new IllegalArgumentException ("Exception: Некорректная длинна примера  ");
        else {
            try {
                 num1 = Integer.parseInt(elements[0]); // првоерка первого числа
                 num2 = Integer.parseInt(elements[2]); // првоерка второго числа
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException ("Exception: Вы вели некорректное число");
            }
            String oper = elements[1];
            result = vichMat(num1, num2, oper);
        }
        return result;
    }

    static int vichMat(int a, int b, String znak) {
        int oper;
        if (a > 10 || a < 1 || b > 10 || b < 1) {   // проверка на диапазон
            throw new IllegalArgumentException ("Exception: Число вне диапазона");
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
                    throw new IllegalArgumentException("Exception: Недопустимого действие"); // првоерка знака по дефолту
            }
        }
        return oper;
    }
}

