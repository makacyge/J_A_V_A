import java.net.SocketOptions;
import java.util.Scanner;
public class Калькулятор {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b, resalts;
        String оператор;

        System.out.println("Введи число");
        a = Double.parseDouble(scan.nextLine());

        System.out.println("Оператор(+-*/):");
        оператор = scan.nextLine();

        System.out.println("Введи число");
        b = Double.parseDouble(scan.nextLine());

        if (оператор.equals(("+")))
        {
            resalts = a + b;
        }
        else if (оператор.equals(("-")))
        {
            resalts = a - b;
        }
        else if (оператор.equals(("*")))
        {
            resalts = a * b;
        }
        else if (оператор.equals(("/")))
        {
            resalts = a / b;
        }
        else
        {
            resalts = 0;
        }
        System.out.println("resalts: " + resalts);

    }
}