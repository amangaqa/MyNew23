package com.learnmaven;

import org.testng.annotations.Test;


// run java file from cmd-maven
//run testng.xml from maven cmd line
//surefire reports with maven
//xslt reports with maven
//commands: 
/*mvn -version
 * mvn archetype:generate
 * mvn eclipse:eclipse
 * generate M2_REPO var(add variable in eclipse)
 * mvn compile
 * mvn test site
 * mvn surefire-report:report
 * */


public class AppTest {
	
	@Test
	public void appTest(){
		System.out.println("**********App Test***********");
	}
	
	
}
    
  
