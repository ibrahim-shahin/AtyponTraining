import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int n;
        int tmp;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[26];

        for (int i = 0; i < n; i++) {
            tmp = (int) (Math.random() * 26);
            System.out.println((char) (tmp + 97));
            arr[tmp]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0)
                System.out.println("count[" + (char) (i + 97) + "]: " + arr[i]);
        }
        sc.close();
    }
}