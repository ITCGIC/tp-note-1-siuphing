package tp_note_1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Program for converting money in Riels to Dollars.\nConversion rate is: 1 USD = 4000 RIELS\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input money in Riels: ");
        int money=sc.nextInt();
        float exchange=(float)money/4000;
        System.out.print(money+" RIELS = "+exchange+" USD");
    }
}
