package Dasgal;

import java.util.Scanner;
import java.math.*;

public class dasgal3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  
		 System.out.print("x1 y1: ");
		 double x1 = sc.nextDouble();
		 double y1 = sc.nextDouble();
		 
		 System.out.print("x2 y2: ");
		 double x2 = sc.nextDouble();
		 double y2 = sc.nextDouble();
		 
		 double zai = Math.hypot(x2 - x1, y2 - y1);
		 
		 double untsug = Math.toDegrees(Math.atan2(y2 - y1, x2 - x1));
		 
		 System.out.println("zai: " +  zai);
		 System.out.println("untsug: " + untsug );
		 
		 

	}

}
