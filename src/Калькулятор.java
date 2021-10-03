import java.util.Scanner;
public class Калькулятор {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Ввести первое число");
      float a =scan.nextInt();
      System.out.println(a + "Первое число");
        System.out.println("Ввести второе число");
        float b = scan.nextInt();
        float c = a - b;
        float c = a + b;
        float c = a * b;
        float c = a / b;
        System.out.println("Ответ: " + c);
    }
}
