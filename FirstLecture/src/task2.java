import java.util.Scanner;

public class task2 {
    static int count(String big, String small) {
        int cnt = 0;
        for (int i = 0; i < big.length() - small.length() + 1; i++) {
            String sub = big.substring(i, i + small.length());
            if (sub.equals(small)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String small = scan.nextLine();
        String big = scan.nextLine();
        int cnt = count(big, small);
        System.out.println(cnt);
        scan.close();
    }
}
