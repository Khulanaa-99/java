package Dasgal;

import java.util.Scanner;
import java.math.*;

public class dasgal4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Zeeliin dun: ");
		 double P = sc.nextDouble();
		 
		 System.out.print("Huu: ");
		 double huu = sc.nextDouble();
		 
		 System.out.print("Sar: ");
		 double n = sc.nextDouble();
		 
		double r = (huu/100)/12;
		
		double M = calculateMonthlyPayment(P, r, n);
		
		double niit = M * n;
		
		double niitHuu = niit - P;
		
		System.out.printf("Sariin tulbur: %.2f₮%n",M);
		System.out.printf("Niit: %.2f₮%n", niit);
		System.out.printf("Niit huu: %.2f₮%n", niitHuu);
		}
	
	private static double calculateMonthlyPayment(double p, double r, double n) {
		 if (r == 0) {
	            return p / n;
	    }
		 
	
		 double compoundFactor = Math.pow(1 + r, n);
	     return p * (r * compoundFactor) / (compoundFactor - 1);
	}
	
	
}
		


