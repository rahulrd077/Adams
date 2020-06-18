package testBase;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;

public class Base {
	
 public static WebDriver driver ;
 
 public static FileInputStream file ;
 
 public Base() {
	 
	 try {
	 file = new FileInputStream ("") ;
	 
	 }
	 
	 catch (Exception e) {
		 
		 e.printStackTrace();
	 }
	 
	 
	 
 }

}
