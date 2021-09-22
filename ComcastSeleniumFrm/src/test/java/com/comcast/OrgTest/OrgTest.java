package com.comcast.OrgTest;

import org.testng.annotations.Test;

public class OrgTest {
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
