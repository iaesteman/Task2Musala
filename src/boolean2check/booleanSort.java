package boolean2check;

import java.util.Arrays;


public class booleanSort {
	static long startTime = System.currentTimeMillis();
	 public static void main(String[] unused) {
		    Boolean[] data = { 
		    	new Boolean(true), 
		    	new Boolean(false),
		        new Boolean(false), 
		        new Boolean(true), new Boolean(false),};
		    Arrays.sort(data); // EXPECT RUNTIME ERROR
		    for (int i = 0; i < data.length; i++)
		      System.out.println(data[i]);
		    long endTime   = System.currentTimeMillis();
			long totalTime = endTime - startTime; // checks running time in ms
			System.out.println("TIME: " + totalTime);
		  }
}
