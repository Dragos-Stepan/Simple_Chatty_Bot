import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num;
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num % 6 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}