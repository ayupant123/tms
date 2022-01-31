package com.tms.controller;

import com.tms.beans.Trainer;

/**
 * @author yasgulat
 *
 */
public class UserRegistrationController {
	
	static Trainer tr =  new Trainer();
	
	public static void register(){
       
	 tr.settId(22);	
	System.out.println(tr.gettId());
	//code to be executed..........
}
}
