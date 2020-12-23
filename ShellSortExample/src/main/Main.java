package main;

import java.text.ParseException;
import java.util.ArrayList;


import model.Person;
import shellsort.ShellSortProcess;
import util.DefineValues;
import util.ShowProcess;

public class Main {

	private static ArrayList<Person> personList = new ArrayList<>();
	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		
		personList = DefineValues.defineValues(personList);
		
		
		System.out.println("---------------------------------");
		System.out.println("BEFORE SHELL SORT byId");
		ShowProcess.showValues(personList);	
		

		System.out.println("AFTER SHELL SORT byId");
		ShellSortProcess.byId(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE SHELL SORT byLastName");		
		ShowProcess.showValues(personList);				
		
		System.out.println("AFTER SHELL SORT byLastName");
		ShellSortProcess.byLastName(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE SHELL SORT byName");
		ShowProcess.showValues(personList);

		System.out.println("AFTER SHELL SORT byName");
		ShellSortProcess.byName(personList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE SHELL SORT byAge");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER SHELL SORT byAge");
		ShellSortProcess.byAge(personList);
		System.out.println("---------------------------------");
		
		System.out.println("BEFORE SHELL SORT byRegisterDate");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER SHELL SORT byRegisterDate");
		ShellSortProcess.byRegisterDate(personList);
		System.out.println("---------------------------------");
	}
}
