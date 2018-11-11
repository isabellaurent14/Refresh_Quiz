package com.company;

public class Main {

	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int num1;
		num1 = keyboard.nextInt();

		int num2;
		num2 = keyboard.nextInt();

		System.out.println("Input your first number: ");
		System.out.println("Input your second number: ");

		if (num1 > 0 && num1 < 21) {
			for (int i = 0; i > num2; i++)
			{Random rnd = new Random();
				int rand = rnd.nextInt(num2);
				System.out.println(rand);
			}
			System.out.println("Number 1: " + num1);
			System.out.println("Number 2: " + num2);
		}
	}