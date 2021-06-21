package by.training.simplestapp.main;

import java.util.Random;
import java.util.Scanner;

public class Main {// Main.class

	public static void main(String[] args) {
		Random rand = new Random();
		int x = rand.nextInt(10);

		switch (x) {
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("default - " + x);
			break;
		}

		System.out.println("111");

	}

}
