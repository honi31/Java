import java.util.Scanner;
import java.lang.*;
public class Ex0308 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 개수 입력: ");
        int input = scan.nextInt();

        int[] array = new int[input];

        for(int i=0; i<input; i++){
            array[i] = (int)(Math.random()*100+1);
            for(int j=0; j<i; j++){
                if(array[i] == array[j]){
                    i--;
                }
            }
        }

        for(int i=1; i < (array.length+1); i++){
            System.out.printf("%4d", array[i-1]);
            if(i%10 == 0){
                System.out.print("\n");
            }
        }
    }
}