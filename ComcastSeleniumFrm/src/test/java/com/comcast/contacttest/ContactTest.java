package com.comcast.contacttest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups="smoke")
	public void createContactTest() {
		System.out.println("execute createcontactTest");
	}
	
	@Test(groups="regression")
	public void createContactwithOrgTest() {
		System.out.println("execute createcontactwithOrgTest");
	}

	@Test(groups="regression")
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest");
	}
}
