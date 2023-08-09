package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsTest {
  @Test
  @Ignore
  public void f() {
	  System.out.println("Logion");
  }
  @Test(dependsOnMethods = "f")
  public void f1() {
	  System.out.println("Creat Admin");
  }
  @Test(dependsOnMethods = "f1")
  public void f2() {
	  System.out.println("Create Employee");
  }
}
