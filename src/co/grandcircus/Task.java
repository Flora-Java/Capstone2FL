package co.grandcircus;

import java.util.LinkedList;
import java.util.Scanner;

public class Task {

	private  String name;
	private  String description;
	private  String date;
	private  boolean done;
	
	public Task(String nam, String desc, String dat) {
		name = nam;
		description = desc;
		date = dat;
		done = false;
	}
	public Task() {
		
	}
	public void setName(String nam) {
		name = nam;
	}	
	public String getName() {
		return name;
	}
	public void setDescription(String desc) {
		description = desc;
	}	
	public String getDescription() {
		return description;
	}	
	public void setDate(String dat) {
		date = dat;
	}
	public String getDate() {
		return date;
	}
	
	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	public void addTask(LinkedList<Task> list, Scanner sc) {
		System.out.println("ADD TASK ");
		System.out.println(" ");
		System.out.println("Team member name :");
		name = sc.nextLine();
		System.out.println("Task Description: ");
		description = sc.nextLine();
		date = Validator.getStringMatchingRegex(sc, "Due date format (MM/DD/YYYY):", "^(0[1-9]|1[012])\\/(0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d$");
		list.add(new Task(name, description,date));
		System.out.println("");
		System.out.println("Task entered!");
	}
	
	public void listTask(LinkedList<Task> list) {
		for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
		}
	}
	@Override // good best practice to use the @Override annotation, 
	// but it is optional
	public String toString() { 
		
		return " ";
	}
	
}

