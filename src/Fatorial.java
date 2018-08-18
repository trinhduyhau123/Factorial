import java.util.Scanner;

public class Fatorial {
    public static int Fac(int n) {
        if (n == 0) {
            return 1;
        }
        return n * Fac(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial: " + Fac(n));
    }
}
