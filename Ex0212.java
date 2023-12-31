package Example;

import java.util.Scanner;
public class Ex0212 {
    public static void main(String[] args) {
        System.out.print("연산식 입력: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String operator = scanner.next();
        int b = scanner.nextInt();

        int result;

        if (operator.equals("+"))
            result = a + b;
        else if (operator.equals("-"))
            result = a - b;
        else if (operator.equals("*"))
            result = a * b;
        else if (operator.equals("/")) {
            if (b == 0){
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            else
                result = a / b;
        }
        else {
            System.out.println("잘못된 사칙연산 입니다.");
            return;
        }
        System.out.println(a + operator + b + "=" + result);
    }
}