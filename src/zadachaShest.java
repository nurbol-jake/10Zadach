import java.util.Scanner;

public class zadachaShest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int t = sc.nextInt();

        if (t < 0) {
            System.out.println("Очень холодно");
        } else if (t >= 0 && t <= 10) {
            System.out.println("Холодно");
        } else if (t >= 11 && t <= 20) {
            System.out.println("Прохладно");
        } else if (t >= 21 && t <= 30) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
    }
}
