package tp_note_1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Program for calculating cost of a call\n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input start hours: ");
        int hour=Integer.parseInt(sc.nextLine());
        System.out.print("Please input start minutes: ");
        int minute=Integer.parseInt(sc.nextLine());
        System.out.print("Please input start seconds: ");
        int second=Integer.parseInt(sc.nextLine());
        System.out.print("Please input end hours: ");
        int h=Integer.parseInt(sc.nextLine());
        System.out.print("Please input end minutes: ");
        int m=Integer.parseInt(sc.nextLine());
        System.out.print("Please input end seconds: ");
        int s=Integer.parseInt(sc.nextLine());

        int start=(hour*3600)+(minute*60)+second;
        int end=(h*3600)+(m*60)+s;
        int duration=end-start;
        int th=duration/3600;
        int tm=(duration%3600)/60;
        int ts=(duration%3600)%60;
        double price=(duration/60)*0.05;
        System.out.println("Total call duration: "+th+"h "+tm+" mn"+ts+" s");
        System.out.println("Total cost of this call: "+price+"$");
        System.out.println(duration);
    }
}
