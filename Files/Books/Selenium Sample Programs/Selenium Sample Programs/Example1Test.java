package src.test.java;

import src.main.java.Example1;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Example1Test {

	@Test
	public void testMain() {
		Example1 e1=new Example1();
		Assert.assertEquals("welcome", "actual");
	}

}
