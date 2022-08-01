package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        t = t > 0 ? t : -1 * t;
        String number = "" + t;
        int length = number.length();
        int sum = 0;
        for (int i = length - 1; i >= 0; i--){
            int dozens = 1;
            for (int j = i; j > 0; j --){
                dozens *= 10;
            }

            int digit = t / dozens;
            sum += digit;
            t -= digit * dozens;
        }
        System.out.println(sum);
    }
}
