package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class simpleAnnotaionTest {
  @Test
  public void f() {
	  System.out.println("Leave Balance Checking");
  }
  @BeforeMethod
  public void f1() {
	  System.out.println("Before method process");
  }
  @AfterMethod
  public void f2() {
	  System.out.println("After method process");
  }
  @Test
  public void f3() {
	  System.out.println("Leave Apply");
  }
  @BeforeClass
  public void f4() {
	  System.out.println("Before Class process");
  }
  @AfterClass
  public void f5() {
	  System.out.println("After Class process");
  }
  @BeforeTest
  public void f6() {
	  System.out.println("Before Test process");
  }
  @AfterTest
  public void f7() {
	  System.out.println("After Test process");
  }
  
}
