package DynamicProgramming.FrogJump;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Frog can take either take 1 step or 2 steps.Find with min energy spent
// START -->  30 10 60 10 60 50  -->STOP

//30--> 60--> 60 --> 50

//40 is the energy spect
public class FrogJump {
    public static void main(String[] args) {
        int jumpSteps[] = {30, 10, 60, 10, 60, 50};
        int minEnergyArr[] = new int[jumpSteps.length];
        Arrays.fill(minEnergyArr, -1);
        System.out.println(new FrogJump().findMinEnergySpent(jumpSteps.length - 1, jumpSteps, minEnergyArr));
    }

    public int findMinEnergySpent(int n, int[] jumpSteps, int[] minEnergyArr) {
        int step_1, step_2 = 0;
        if (n == 0) {
            return 0;
        }
        if (minEnergyArr[n] != -1) {
            return minEnergyArr[n];
        } else {
            step_1 = findMinEnergySpent(n - 1, jumpSteps, minEnergyArr) + Math.abs(jumpSteps[n] - jumpSteps[n - 1]);
            if (n > 1) {
                step_2 = findMinEnergySpent(n - 2, jumpSteps, minEnergyArr) + Math.abs(jumpSteps[n] - jumpSteps[n - 2]);
            }
            minEnergyArr[n] = Math.min(step_1, step_2);
            return minEnergyArr[n];
        }
    }
}
