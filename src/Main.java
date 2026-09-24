import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите число: ");
    int number = scanner.nextInt();

    if (number > 0) {
        System.out.println("Число положительное");
    } else if (number < 0) {
        System.out.println("Число отрицательное");
    } else {
        System.out.println("Число равно нулю");
    }
}
