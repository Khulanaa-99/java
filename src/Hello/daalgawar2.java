package Hello;

import java.util.Scanner;

public class daalgawar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Seconds: ");
        int anhniiSeconds = sc.nextInt();

        int day = anhniiSeconds / 86400;
        int hour = (anhniiSeconds % 86400) / 3600;
        int minute = (anhniiSeconds % 3600) / 60;
        int second = anhniiSeconds % 60;

        System.out.println("odor " + day + " tsag " + hour + " minut " + minute + " seconds " + second);
    }
}
