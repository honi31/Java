import java.util.Scanner;

package Example;

public class Ex0203 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();;
        System.out.println("금액 입력: "+price);

        int five_million = price/50000;
        price %= 50000;

        int million = price/10000;
        price %= 10000;

        int five_thousand = price/5000;
        price %= 5000;

        int thousand = price/1000;
        price %= 1000;

        int five_hundred = price/500;
        price %= 500;

        int hundred = price/100;
        price %= 100;

        int five_ten = price/50;
        price %= 50;

        int ten = price/10;
        price %= 10;

        int one = price/1;

        System.out.println("오만원 " + five_million);
        System.out.println("만원 " + million);
        System.out.println("오천원 " + five_thousand);
        System.out.println("천원 " + thousand);
        System.out.println("500원 " + five_hundred);
        System.out.println("100원 " + hundred);
        System.out.println("50원 " + five_ten);
        System.out.println("10원 " + ten);
        System.out.println("1원 " + one);
    }
}
