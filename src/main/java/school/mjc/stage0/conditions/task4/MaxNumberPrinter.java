package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = third > (first > second ? first : second) ? third : ((first > second) ? first : second);
        System.out.println(result);
    }
}
