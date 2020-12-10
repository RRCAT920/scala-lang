package introduction;

import java.util.Arrays;
import java.util.List;

/**
 * @author huzihao
 * @since 2020/12/9 15:48
 */
public class FindMaxImperativeJava {
    public static int findMax(List<Integer> temperatures) {
        int maxT = Integer.MIN_VALUE;
        for (Integer temperature : temperatures) {
            if (temperature > maxT) maxT = temperature;
        }
        return maxT;
    }

    public static void main(String[] args) {
        List<Integer> temps = Arrays.asList(10, 20, 3333, 100, 30);
        int maxT = findMax(temps);
        System.out.printf("The maximum temperature is %s%n", maxT);
    }
}
