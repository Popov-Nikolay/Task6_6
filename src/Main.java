import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        int e = scanner.nextInt();
        double summn = 0;
        double summe = 0;
        double summe10 = 0;
        for (int i = 0; i <= n * 2; i += 2) {
            summn += Math.pow(x, n) - Math.pow(x, n + 1);
            if (Math.pow(x, n) - Math.pow(x, n + 1) > e) {
                summe += Math.pow(x, n) - Math.pow(x, n + 1);
            }
            if (Math.pow(x, n) - Math.pow(x, n + 1) > e / 10) {
                summe10 += Math.pow(x, n) - Math.pow(x, n + 1);
            }
        }
        System.out.println("Cумма n слагаемых: " + summn);
        System.out.println("Сумма тех слагаемых, которые по абсолютной величине больше e: " + summe);
        System.out.println("Сумма тех слагаемых, которые по абсолютной величине больше e/10: " + summe10);
        System.out.println("Значение функции: " + (1 / (1 + x)));
    }
}