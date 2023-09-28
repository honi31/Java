import java.lang.*;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;

        System.out.print("랜덤한 정수들:");
        for (int i=0; i<10; i++) {
            array[i] = (int)(Math.random()*10+1);
            System.out.print("\t" + array[i]);
            sum += array[i];
        }

        System.out.print("\n");
        System.out.printf("평균: %.1f", (float)sum/10);
    }
}