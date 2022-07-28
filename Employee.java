package com.training;

import java.util.*;

class Employees {
	int empcode;
	String empname;
	double salary;
	String emprole;

	public Employees(int empcode, String empname, double salary, String emprole) {
		this.empcode = empcode;
		this.empname = empname;
		this.salary = salary;
		this.emprole = emprole;
	}

	@Override
	public String toString() {
		return "Employees{" + "empcode=" + empcode + ", empname='" + empname + '\'' + ", salary=" + salary
				+ ", emprole='" + emprole + '\'' + '}';
	}
}

class Permanent_Employee extends Employee {

}

class PartTime_Employee extends Employee {

}

class Contract_Employee extends Employee {

}

class Employee {

	public static void main(String[] args) {
// Creating data using hashtable 
		Hashtable<Integer, Employees> tab = new Hashtable<Integer, Employees>();
		tab.put(1, new Employees(1, "arun", 50000, "contract"));
		tab.put(2, new Employees(2, "varun", 60000, "Permanent"));
		tab.put(3, new Employees(3, "arav", 70000, "Parttime"));
// Removing existing data from hashtable
		 tab.remove(3);
// updating values in hashtable 
		tab.put(2, new Employees(2, "Siranjeevi", 60000, "Permanent"));
		System.out.println("Please enter the Hash id");

//        System.out.println(tab.toString());
// Search functionallity from hashtable via scanner and displaying the value of particular hash key
		try (Scanner inp = new Scanner(System.in)) {
			String str = inp.nextLine();
			if (str == "") {
				System.out.println("Value is emtpy please enter key");
			} else {
				int i = Integer.parseInt(str);
				if (tab.get(i) == null) {
					System.out.println("No data found");
				} else System.out.println(tab.get(i));
				}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
	
}
