package testBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {
	
 public static WebDriver driver ;
 
 public static FileInputStream file ;
 
 public static Properties prop ;
 
 public Base() throws Exception{
	 
	 try {
	 file = new FileInputStream ("") ;
	 
	 }
	 
	 catch (Exception e) {
		 
		 e.printStackTrace();
	 }
	 
	 prop = new Properties();
	 
	 prop.load(file);
	 
 }
 
 
 public static void InitializingBase() {
	 
	 
 }

}
