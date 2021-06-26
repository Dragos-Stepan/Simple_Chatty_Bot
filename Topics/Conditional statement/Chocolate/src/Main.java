import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String res = "NO";
        
        boolean verti = k % m == 0;
        
        boolean hori = k % n == 0;
        
        if (!(k > n * m) && (verti || hori)) {
            res = "YES";
        } 
        System.out.println(res);
    }
}
