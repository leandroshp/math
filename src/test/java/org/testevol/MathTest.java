package org.testevol;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.testevol.dumb.DumbObj;

public class MathTest {

	/*
	 * Test removed, because throws an CompilationError.
	 * It must be included in Category C4
	@Test
	public void abs(){
		Assert.assertEquals(8, Math.abs(-8));
	}
	*/
	
	/*
	 * Test removed, but it should still pass in this version of the program.
	 * It must be included in Category C5.

	@Test
	public void round(){
		Assert.assertEquals(8, Math.round(8.4));
	}
	*/
	
	/*
	 * Test included that also passes on the old version of the program.
	 * Must be included in Category C8
	 */
	@Test
	public void newRound(){
		Assert.assertEquals(8, Math.round(8.4));
		Assert.assertEquals(9, Math.round(9.4));
	}

	
	public void testPing(){
		Assert.assertEquals("pong", Math.ping(new DumbObj("pong")));
	}
	
	/**
	 * Included toi validade a bux fix. Category C6
	 */
	@Test
	public void newRound2(){
		Assert.assertEquals(9, Math.round(8.5));
	}
	
	@Test
	public void newRound_Clone(){
		Assert.assertEquals(10, Math.round(9.9));
	}

	/*
	 *This test will throw a NullPointerException in the old version,
	 *thus it will be included in Category C6 
	 */
	@Test
	public void tan(){
		Assert.assertEquals(0.0, Math.tan(null), 0.001);
	}
	
	@Test
	public void max(){
		double max = Math.max(1.0,2.0);
		Assert.assertEquals(2.0,max,0.001d);
	}
	
	/*
	 * Test removed, because throws an RuntimeException.
	 * It must be included in Category C3
	@Test
	public void min(){
		int min = Math.min(1,1);
		Assert.assertEquals(1,min);
	}
	*/
	
	@Test
	public void pow(){
		Assert.assertEquals(8.0, Math.pow(2, 3), 0.001);
		Assert.assertEquals(1.0, Math.pow(1, 0), 0.001);
	}
	
	/*
	 * The method Math.sqrt does not exist in the old version, so
	 * this test will cause an compilation error, consequently this
	 * test in included in Category C7
	 */
	@Test
	public void sqrt(){
		Assert.assertEquals(5.0, Math.sqrt(25.0), 0.001);
	}
	
	@Test
	public void sumFile() throws IOException{
		Assert.assertEquals(3, Math.sumFile());
	}
	
	/*
	@Test
	public void thiIsNotAClone() throws IOException{
		Assert.assertEquals("leandro", Math.printMath("leandro"));
		Assert.assertEquals(8.0, Math.pow(2, 3));
	}*/
	
	public void testPing2_Clone(){
		Assert.assertEquals("pong", Math.ping(new DumbObj("pong")));
		Assert.assertEquals("ping", Math.ping(new DumbObj("ping")));
	}
	
	@Test
	public void testCompare(){
		Assert.assertEquals(1, 1);
		Assert.assertEquals(2, 2);	
	}
	
	/*@Test
	public void testEcho(){
		Math.echo("test");
	}*/
}
