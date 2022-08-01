package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++){
            int number = 1;
            for (int j = 1; j <= i; j++){
                number *= 10;
            }
            sum += number - 1;
        }
        System.out.println(sum);
    }
}
