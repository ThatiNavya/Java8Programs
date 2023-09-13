//Print emp names who are working in Hyd location in DB team.
package com.Predicate_Joining;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Emp_PredicateJoin {

	public static void main(String[] args) {
		Employee e1 = new Employee("Anil", "Chennai", "Devops");
		Employee e2 = new Employee("Rani", "Pune", "Networking");
		Employee e3 = new Employee("Ashok", "Hyd", "DB");
		Employee e4 = new Employee("Ganesh", "HYd", "DB");
		List<Employee> emps = Arrays.asList(e1, e2, e3, e4);
		Predicate<Employee> p1 = e -> e.location.equals("Hyd");
		Predicate<Employee> p2 = e -> e.dept.equals("DB");
		Predicate<Employee> p3 = e -> e.name.startsWith("A");

		Predicate<Employee> p = p1.and(p2).and(p3);
		
		for (Employee e : emps) {
			if (p.test(e)) {
				System.out.println(e.name);
			}
		}
		System.out.println("******************************");
		Predicate<Employee> p4 = p1.and(p2).or(p3);
		for (Employee e : emps) {
			if (p4.test(e)) {
				System.out.println(e.name);
			}
		}
	}

}
