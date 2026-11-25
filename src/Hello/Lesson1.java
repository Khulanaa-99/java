package Hello;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Нэр:");
		String name = sc.nextLine();
		System.out.print("Нас:");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Мэргэжил:");
		String job = sc.nextLine();
		System.out.print("Голч:");
		double number = sc.nextDouble();
		
		System.out.println("=====ОЮУТНЫ КАРТ=====");
		System.out.println("Нэр: "+ name);
		System.out.println("Нас: "+ age);
		System.out.println("Мэргэжил: "+job);
		System.out.println("Голч: "+ number);
		System.out.println("=====================");

	}

}
