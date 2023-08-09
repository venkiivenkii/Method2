package com.testng;


import org.testng.annotations.Test;

public class PriorityTest {
	 @Test(priority = -1)
	  public void f() {
		  System.out.println("Logion");
	  }
	  @Test(priority = 1)
	  public void f1() {
		  System.out.println("Creat Admin");
		 
	  }
	  @Test(priority = 2)
	  public void f2() {
		  System.out.println("Create Employee");
	  }
	  @Test(priority = 0)
	  public void f3() {
		  System.out.println("Time Sheet");
	  }

}
