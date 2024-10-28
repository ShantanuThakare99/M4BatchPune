package com.crm.JavaUtility;

import java.util.Random;

public class RandomNumber {

	public int randomNumber() {
		Random rdm = new Random();
		int num = rdm.nextInt(1000);
		
		return num;
	}
}
