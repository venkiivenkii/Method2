package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
  @Test
  public void f() {
	  System.out.println("Logion");
  }
  @Test
  @Ignore
  public void f1() {
	  System.out.println("Creat Admin");
	 
  }
  @Test(enabled = false)
  public void f2() {
	  System.out.println("Create Employee");
  }
  @Test
  public void f3() {
	  System.out.println("Time Sheet");
  }
  
  
  
  
}
