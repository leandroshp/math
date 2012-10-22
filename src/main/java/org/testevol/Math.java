package org.testevol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class Math {

	public static int round(double a){
		if(a + 0.5 > (int)(a+1)) return (int)(a + 1);
		
		return (int)a;
	}
	
	public static double pow(double a, double b){
		
		if(b == 0.0){
			return 1;
		}
		
		double result = 1;
		for (int i = 0; i < b; i++) {
			result = result*a;
		}
		
		return result;
	}

	public static int abs(int value){
		if(value < 0){
			return -1*value;
		}
		
		return value;
	}
	
	public static int max(int a, int b){
		if(a > b) return a;
		return b;
	}

	public static int min(int a, int b){
		if(a < b) return a;
		return b;
	}

	public static double tan(Double a){
		return java.lang.Math.tan(a.doubleValue());
	}
	
	public static int sumFile(Reader reader) throws IOException{
		BufferedReader fileReader = new BufferedReader(reader);
		int sum = 0;
		String line;
		while((line = fileReader.readLine()) != null){
			sum += Integer.parseInt(line);
		}
		return sum;
	}
	
	public static String printMath(String s){
		System.out.println(s);
		return s;
	}
	
	public static String echo(String s){
		System.out.println(s);
		return s;
	}
	
	public static String ping(DumbObj s){
		return s.value;
	}
}
