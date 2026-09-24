import java.util.Scanner;

public class zadachaDevyat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int n2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int n3 = sc.nextInt();

        int max = n1; // Сначала думаем, что первое самое большое

        if (n2 > max) {
            max = n2; // Если второе больше — запоминаем его
        }
        if (n3 > max) {
            max = n3; // Если третье больше — запоминаем его
        }

        System.out.println("Максимальное число: " + max);
    }
}
