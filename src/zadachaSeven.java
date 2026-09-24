import java.util.Scanner;

public class zadachaSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();

        // Главное — сначала проверить общую деримость на оба числа через &&, иначе код сработает неверно!
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Число делится на 3 и на 5");
        } else if (num % 3 == 0) {
            System.out.println("Число делится только на 3");
        } else if (num % 5 == 0) {
            System.out.println("Число делится только на 5");
        } else {
            System.out.println("Не делится ни на 3, ни на 5");
        }
    }
}
