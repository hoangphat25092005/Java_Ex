import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class damage_cal {

    public static double calDamage(int n, double[] timestamps, double x, double y, double z) {
        List<Double> activeQuills = new ArrayList<>();
        double total = 0.0;

        for (double currentTime : timestamps) {
            for (int i = 0; i < activeQuills.size(); ) {
                if (activeQuills.get(i) < currentTime - z) {
                    activeQuills.remove(i); 
                } else {
                    i++;
                }
            }

            // Compute damage
            double damage = x + y * activeQuills.size();
            total += damage;

            // Added current quill
            activeQuills.add(currentTime);
        }

        return total;
    }
    public static void main(String[] args) {
        // Test case input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] timestamps = new double[n];
        for (int i = 0; i < n; i++) {
            timestamps[i] = input.nextDouble();
        }
        double x = input.nextDouble();     // base damage
        double y = input.nextDouble();     // bonus per active quill
        double z = input.nextDouble();   // quill duration

        double totalDamage = calDamage(n, timestamps, x, y, z);
        System.out.printf("%.1f\n", totalDamage);
        input.close();
    }

}
