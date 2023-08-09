package com.testng;

import org.testng.annotations.Test;

public class ExpectedTest {
  @Test(expectedExceptions = StringIndexOutOfBoundsException.class)
  public void f() {
	  String s="Morning";//length =1,2,3,4,5,6,7 Index=0,1,2,3,4,5,6
	  System.out.println(s.charAt(9));
  }
}
