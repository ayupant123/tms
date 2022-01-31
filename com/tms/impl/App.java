package com.tms.impl;

import com.tms.controller.UserLoginController;
import com.tms.controller.UserRegistrationController;
import com.tms.util.ReadData;

/**
 * 
 * @author yasgulat
 * @since jan 2022
 * @version 1.0
 *
 *
 */

public class App {
	
	

	public static void main(String[] args) {
		

		System.out.println("------Welcome to Trainer Management System-------");
		System.out.println("-----------Select an Option to continue----------");
		System.out.println("0. Trainer");
		System.out.println("1. Employee");
		System.out.println("2. Exit");
		System.out.println("-------------------------------------------------");
		
		int choice = ReadData.getIntegerValue("choice");
		
		switch(choice) {
		case 0:
			trainer();
			break;
		case 1:
			employee();
			break;
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Please choose a correct option!!");
			break;
	}
		

	}
	
	public static void trainer(){
		
		int ch = ReadData.getIntegerValue("choice");
		switch(ch)
		
		{
		case 0: UserRegistrationController.register();
		break;
		case 1: UserLoginController.login();
		break;
		}
	}
	public static void employee() {
		int ch = ReadData.getIntegerValue("choice");
		
		switch(ch)
		{
		case 0: UserRegistrationController.register();
		break;
		case 1: UserLoginController.login();
		break;

		}
}

}

