import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст и нажмите Enter: ");
        String text = scanner.nextLine();
        System.out.println("Длина текста: " + text.length());
    }
}