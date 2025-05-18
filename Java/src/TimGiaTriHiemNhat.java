import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TimGiaTriHiemNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int t = 0; t < T; t++) {
            String line = sc.nextLine();
            String[] parts = line.split("\\s+");

            Map<Integer, Integer> freq = new HashMap<>();

            for (int i = 1; i < parts.length; i += 2) {
                int val = Integer.parseInt(parts[i]);
                freq.put(val, freq.getOrDefault(val, 0) + 1);
            }

            int minFreq = Collections.min(freq.values());

            int ans = Integer.MAX_VALUE;
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                if (entry.getValue() == minFreq) {
                    if (entry.getKey() < ans) {
                        ans = entry.getKey();
                    }
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
