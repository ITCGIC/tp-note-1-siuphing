package tp_note_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Program for converting time to seconds");
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input hour: ");
        int hour=Integer.parseInt(sc.nextLine());
        System.out.print("Please input minute: ");
        int minute=Integer.parseInt(sc.nextLine());
        System.out.print("Please input second: ");
        int second=Integer.parseInt(sc.nextLine());
        int s=(hour*3600)+(minute*60)+second;
        System.out.println("Number of seconds = "+hour+"x3600 + "+minute+"x60 + "+second+" = "+s);
    }
}
