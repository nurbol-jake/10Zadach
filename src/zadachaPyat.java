import java.util.Scanner;

public class zadachaPyat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = sc.nextInt();
        if (grade == 5) {
            System.out.println("Отлично");
        } else if (grade == 4) {
            System.out.println("Хорошо");
        } else if (grade == 3) {
            System.out.println("Удовлетворительно");
        } else if (grade == 2) {
            System.out.println("Неудовлетворительно");
        } else if (grade == 1) {
            System.out.println("Очень плохо");
        } else {
            System.out.println("Некорректная оценка");
        }}
}
