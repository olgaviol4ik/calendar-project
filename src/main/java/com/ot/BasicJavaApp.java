/**
 * File Name: JavaApp.java<br>
 * Turaeva, Olga<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Sep 8, 2016
 */
package com.ot;

import com.ot.helpers.*;

public class BasicJavaApp {

	public static void main(String[] args) {
		BasicJavaApp myApp = new BasicJavaApp();
		start(myApp);
	}

	private static void start(BasicJavaApp myApp) {
		myApp.init();
		myApp.main();
		myApp.tearDown();
	}

	private String appName = "Basic Java App";

	private String user;

	public String getAppName() {
		return this.appName;
	}

	public String getUser() {
		return this.user;
	}

	public void main() {
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setUser(String user) {
		this.user = user;
	}

	private void init() {
		this.user = AppBasics.welcomeUserAndGetUsersName(this.appName);
	}

	private void tearDown() {
		AppBasics.farewellUser(this.user, this.appName);
	}
}
