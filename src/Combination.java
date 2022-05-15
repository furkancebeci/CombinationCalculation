import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of elements(n): ");
        int n = input.nextInt();

        System.out.print("Number of choices(r): ");
        int r = input.nextInt();

        int factN = 1;
        int factR = 1;
        int factF = 1;

        for (int i=1; i<=n; i++) {
            factN *= i;
        }

        for (int i=1; i<=r; i++) {
            factR *= i;
        }

        for (int i=1; i<=(n-r); i++) {
            factF *=i;
        }
        System.out.println("C(" + n + "," + r + "): " + (factN) / ((factR) * (factF)));
    }
}
