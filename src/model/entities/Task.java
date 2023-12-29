package model.entities;

import java.util.ArrayList;

public class Task {
	private ArrayList<String> services = new ArrayList<String>();
	
	private Invoice invoice;
	private Computer computer;
	
	public Task(){}

	public Task(ArrayList<String> services, Computer computer) {
		this.services = services;
		this.computer = computer;
	}

	public ArrayList<String> getServices() {
		return services;
	}

	public void setServices(ArrayList<String> services) {
		this.services = services;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "Task [services=" + services + ", invoice=" + invoice + ", computer=" + computer + "]";
	}
	
	
	
}
