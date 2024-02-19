package application;

import java.util.ArrayList;
import java.util.Scanner;

import model.entities.Computer;
import model.entities.Task;
import model.services.TaskService;
import model.services.Tax;

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
		int size = list.size();
		Task task = new Task(list, new Computer(name));
		
		System.out.println();
		double price = 0;
		for(int i=0;i<list.size();i++) {
			System.out.print("Enter the " + (i+1) + " service price: ");
			price+= sc.nextDouble();
		}
		TaskService ts = new TaskService(price, size, new Tax());
		ts.processInvoice(task);
		
		System.out.println();
		System.out.println("Computer: " + task.getComputer().getName() + 
				"\nServices: " + task.getServices().toString() +
				"\nPrice: " + task.getInvoice().fullPrice());
		
		sc.close();
	}

}
