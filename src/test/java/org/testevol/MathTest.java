package org.testevol;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import junit.framework.Assert;

import org.junit.Test;


public class MathTest{


	@Test
	public void testAbs(){
		Assert.assertEquals(8, Math.abs(-8));
	}
	
	@Test
	public void round(){
		Assert.assertEquals(8, Math.round(8.4));
	}
	
	/**
	 * This test was removed because it throws an assertion fail
	 * in the new version of the program. It must be included in
	 * category C3
	 */
	@Test
	public void round2(){
		Assert.assertEquals(8, Math.round(8.5));
	}
		
	//This test will be included in the C1 category, as it will
	//fail in P' because Math.max has changed parameters and return type
	@Test
	public void max(){
		int max = Math.max(1,2);
		Assert.assertEquals(2,max);
	}

	@Test
	public void min(){
		int min = Math.min(1,1);
		Assert.assertEquals(1,min);
	}
	
	@Test
	public void pow(){
		Assert.assertEquals(8.0, Math.pow(2, 3));
	}

	@Test
	public void sumFile() throws IOException{
		Reader reader = new InputStreamReader(Math.class.getResourceAsStream("test.txt"));
		Assert.assertEquals(2, Math.sumFile(reader));
	}
	
	@Test
	public void print() throws IOException{
		Assert.assertEquals("testevol", Math.printMath("testevol"));
	}
	
	@Test
	public void echo() throws IOException{
		Assert.assertEquals("testevol", Math.echo("testevol"));
	}
	
	public void testPing(){
		Assert.assertEquals("pong", Math.ping(new DumbObj("pong")));
	}
	
	@Test
	public void newRoundOriginal(){
		Assert.assertEquals(10, Math.round(9.9));
	}

	public void testPing2(){
		Assert.assertEquals("pong", Math.ping(new DumbObj("pong")));
		Assert.assertEquals("ping", Math.ping(new DumbObj("ping")));
	}
	
	@Test
	public void testCompare(){
		Assert.assertEquals(1, 1);
	}
	
	@Test
	public void testEcho2(){
		Math.echo("testi");
	}
}
