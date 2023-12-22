package application;

import java.util.ArrayList;
import java.util.Scanner;

import model.entities.Computer;
import model.entities.Task;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the computer name: ");
		String name = sc.nextLine();
		System.out.print("How many services this computer will need? ");
		int a = sc.nextInt();
		System.out.println();
		System.out.print("Services avaliable: "
					  +"\nCleaning(basic)  Cleaning(complete) "
					  +"\nBuild            Update(driver or BIOS)");
		System.out.println();
		System.out.println();
		sc.nextLine();
		
		ArrayList<String> list = new ArrayList<String>(a);
		for(int i=0;i<a;i++) {
		System.out.print("Enter the " + (i+1) + " service: ");
		list.add(sc.nextLine());
		}
		Task task = new Task(list, new Computer(name));
		
		
		
		
		
		
	}

}
