package tp_note_1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.print("Program for converting seconds into formated H:M:S\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of seconds: ");
        int second=Integer.parseInt(sc.nextLine());
        int hour = second/3600;
        int minute = (second%3600)/60;
        int remain = (second%3600)%60;
        System.out.println(" Time corresponding to "+second+"second is "+hour+":"+minute+":"+remain);
    }
}
