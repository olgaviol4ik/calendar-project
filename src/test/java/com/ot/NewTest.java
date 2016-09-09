package com.ot;

import org.testng.annotations.*;

import com.ot.helpers.*;

public class NewTest {

	public Object[][] dp() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@Test
	public void f() {
		DisplayData.objectArray(dp());
	}
}
