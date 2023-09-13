package com.Predicate_personAge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonsDemo {
 public static void main(String[] args) {
	 Person p1 = new Person("Navya",23);
	 Person p2 = new Person("Jyothsna",21);
	 Person p3 = new Person("Nandini",16);
	 Person p4 = new Person("Srilatha",28);
	 Person p5 = new Person("Nanditha",29);
	 List<Person> persons=Arrays.asList(p1,p2,p3,p4,p5);
	 Predicate<Person> predicate= p->p.age>=18;
	 for(Person person:persons) {
		 if(predicate.test(person)) {
			 System.out.println(person.name);
		 }
	 }
}
}
