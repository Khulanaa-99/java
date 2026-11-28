package Dasgal;

import java.util.Scanner;

public class Dasgal1 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.print("Too: ");
	      int shirheg = sc.nextInt();
	      
	      int a = shirheg / 1000;
	      int b = (shirheg / 100)%10;
	      int c = (shirheg / 10)%10;
	      int d = shirheg % 10;
	      
	      int sum = a + b + c + d;
	      
	      int urwuu = d * 1000 + c * 100 + b * 10 + a;
	      
	      
	      System.out.println("Niilber: " + sum);
	      System.out.println("Urwuu: " + urwuu);
		

	}

}
