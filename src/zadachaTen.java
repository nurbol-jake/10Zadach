import java.util.Scanner;

public class zadachaTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = sc.nextInt();

        // Формула из методички: делится на 400 ИЛИ (делится на 4 И НЕ делится на 100)
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}
