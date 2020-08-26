package io.testproject.generated.tests.myfirstproject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iBaseParam = "10"; 
		boolean hasParameter = false;
	    boolean hasTimeInterval = false ;
	    try {
	      FileInputStream fstream = new FileInputStream("src/main/resources/UOPowerAsParamLovs.txt");
	      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	      String strLine;         
	      // Read File Line By Line
	      while ((strLine = br.readLine()) != null) {
	        System.out.println(strLine);
	        if (iBaseParam.equals(strLine)) {
	          hasParameter = true ;
	        }
	      }
	      fstream.close();

	      if (!hasParameter) {
	        fstream = new FileInputStream("src/main/resources/UOTimeAsParamLovs.txt");
	        br = new BufferedReader(new InputStreamReader(fstream));     
	        // Read File Line By Line
	        while ((strLine = br.readLine()) != null) {
	          System.out.println(strLine);
	          if (iBaseParam.equals(strLine)) {
	            hasTimeInterval = true ;
	          }
	        }
	        fstream.close();
	      }
	    } catch (Exception e) {// Catch exception if any
	        System.err.println("Error: " + e.getMessage());
	    }
	    if (hasParameter) {

	    } else if (hasTimeInterval) {
	    	System.out.print("Hey");
	    }

	}

}
