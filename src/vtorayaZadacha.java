import java.util.Scanner;

public class vtorayaZadacha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();

        // Проверяем остаток от деления на 2
        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }}
