import java.util.*;

public class boats {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = 0;

            for (int s = 2; s <= 2*n; s++) {

                boolean[] used = new boolean[n];
                int teams = 0;

                for (int i = 0; i < n; i++) {
                    if (used[i]) {
                        continue;
                    }
                    for (int j = i + 1; j < n; j++) {
                        if (!used[j] && arr[i] + arr[j] == s) {
                            used[i] = true;
                            used[j] = true;

                            teams++;
                            break;
                        }
                    }
                }

                ans = Math.max(ans, teams);
            }
            System.out.println(ans);
        }
    }
}