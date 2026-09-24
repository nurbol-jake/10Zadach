import java.util.Scanner;

public class zadachaVosem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Первое число: ");
            double num1 = sc.nextDouble(); // Берем double на случай деления с остатком

            System.out.print("Оператор: ");
            String op = sc.next();

            System.out.print("Второе число: ");
            double num2 = sc.nextDouble();

            if (op.equals("+")) {
                System.out.println("Результат: " + (num1 + num2));
            } else if (op.equals("-")) {
                System.out.println("Результат: " + (num1 - num2));
            } else if (op.equals("*")) {
                System.out.println("Результат: " + (num1 * num2));
            } else if (op.equals("/")) {
                // Проверка на ноль, как просили в задании
                if (num2 == 0) {
                    System.out.println("Ошибка: Деление на ноль!");
                } else {
                    System.out.println("Результат: " + (num1 / num2));
                }
            } else {
                System.out.println("Неверный оператор");
            }
        }
    }

