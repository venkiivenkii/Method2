package com.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
  @Test(timeOut = 4000)
  public void f() throws InterruptedException {
	  System.out.println("Login");
	  Thread.sleep(1000);
	  System.out.println("Creat Emplyeee");
	  Thread.sleep(1000);
	  System.out.println("Time Sheet");
	  Thread.sleep(1000);
	  System.out.println("Food Price");
  }
}
