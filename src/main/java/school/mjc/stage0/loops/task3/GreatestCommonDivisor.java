package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {

        int gcDivisor = 1;
        int min = first > second ? second : first;
        min = min == 0 ? first + second : min;

        for (int i = 1; i <= min; i++){
            if (first % i == 0 & second % i ==0){
                gcDivisor = i;
            }
        }
        System.out.println(gcDivisor);
    }
}
