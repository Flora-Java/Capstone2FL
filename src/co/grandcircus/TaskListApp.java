package co.grandcircus;

import java.util.LinkedList;
import java.util.Scanner;

public class TaskListApp {

	public static void main(String[] args) {

		LinkedList<Task> listOfTasks = new LinkedList<Task>();
		
		Scanner scan = new Scanner(System.in);
		char flag = 'N';
		int selection = 0;
		Task tarea = new Task();

		System.out.println("Welcome to the Task Manager!");
		System.out.println();
		
		while (flag == 'n' || flag == 'N') {
			printMenu();
			selection = Validator.getInt(scan, "What would you like to do?", 1, 5);
			switch (selection) {
			case 1:
				if (!(listOfTasks.size() == 0) ) {
				  printHeader();
		  		  tarea.listTask(listOfTasks);
				  continue;
				}
				else {
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("List is empty");
					System.out.println(" ");
				}
				continue;
			case 2:
				tarea.addTask(listOfTasks, scan);
				continue;
			case 3:
				// delete task;
				continue;
			case 4:
				// mark task complete
				continue;
			case 5:
				System.out.println("Are you sure you want to quit? (Y/N) ");
				flag = scan.next().charAt(0);
				if (flag == 'y' || flag == 'Y') {
					System.out.println(" ");
					System.out.println("Good bye");
					System.out.println(" ");

					break;
				}
			}
		}

	}

	public static void printMenu() {
		System.out.println("Options: ");
		System.out.println("1. List Tasks");
		System.out.println("2. Add Tasks");
		System.out.println("3. Delete Tasks");
		System.out.println("4. Mark Task complete");
		System.out.println("5. Quit");
		System.out.println(" ");

	}

	public static void printHeader() {
		String aligning = "%-15s %-15s %-15s %-15s \n";
		System.out.printf(aligning, "Name", "Due date", "Completed", "Description");
		System.out.println(" ");
	}

}
