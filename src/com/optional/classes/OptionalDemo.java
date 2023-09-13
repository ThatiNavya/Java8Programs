package com.optional.classes;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Customer customer = new Customer(101, "Navya", "navya@gmail.com");
		
		/*
		 *  // Customer customer = new Customer(101, "Navya", null );//null Customer
		 *  String email = customer.getEmail(); System.out.println(email);
		 */
		
		//When you know that Optional Container is never null
		/*
		 * Optional<String> emailOptional = Optional.of(customer.getEmail());
		 * System.out.println(emailOptional);
		 */
		//When you know that Optional Container is either null or contains some value
		/*
		 * Optional<String> emialOptional2 = Optional.ofNullable(customer.getEmail());
		 * System.out.println(emialOptional2);
		 */
        
		/*
		 * Customer customer1 = new Customer(101, "Navya", null); Optional<String>
		 * emialOptional3 = Optional.ofNullable(customer1.getEmail());
		 * System.out.println(emialOptional3);
		 */
        
		Customer customer2 = new Customer(101, "Navya",  "navya@gmail.com" );
		
		/*Optional<String> emailOptional4 = Optional.ofNullable(customer2.getEmail());
		 * if(emailOptional4.isPresent() ) { System.out.println(emailOptional4.get()); }
		 * else { System.out.println("No data Found"); }
		 */
		Optional<String> emailOptional5 = Optional.ofNullable(customer2.getEmail());
		//System.out.println(emailOptional5.orElse("No Email Data Found"));
	
		 //System.out.println(emailOptional5.orElseGet(()->"No Data Found"));

	     //System.out.println(emailOptional5.orElseThrow(()-> new IllegalArgumentException("Emial Data Not Found") ));
	
	     System.out.println(emailOptional5.map(String::toUpperCase));
	      
	     System.out.println(emailOptional5.map(String::length));
	     
	     System.out.println(emailOptional5.map(String::hashCode));
	     
	     System.out.println(emailOptional5.map(String::toUpperCase).orElseGet(()->"Fill your emial id"));
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
