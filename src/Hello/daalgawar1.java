package Hello;

import java.util.Scanner;

public class daalgawar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Baraanii ner: ");
        String name = sc.nextLine();
    
        System.out.print("Negj vne: ");
        double price = sc.nextDouble();

        System.out.print("Too shirheg: ");
        int shirheg = sc.nextInt();

        System.out.print("Hungulult (%): ");
        double bonus = sc.nextDouble();

        double niitVne = price * shirheg;
        double hungulult = niitVne * bonus / 100;
        double hasalt = niitVne - hungulult;
        double nout = Math.round(hasalt * 10 / 100);
        double tuluh = hasalt + nout;

        System.out.println("------------------------");
        System.out.printf("Niit vne : %,.0f₮%n", niitVne);
        System.out.printf("Hungulult : -%,.0f₮%n", hungulult);
        System.out.printf("Nout (10%) : %,.0f₮%n", nout);
        System.out.printf("Tuluh dun : %,.0f₮%n", tuluh);
        System.out.println("------------------------");

        sc.close();
}
}
