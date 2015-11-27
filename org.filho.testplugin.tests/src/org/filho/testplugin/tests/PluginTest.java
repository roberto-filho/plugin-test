package org.filho.testplugin.tests;

import static org.junit.Assert.*;

import org.filho.testplugin.app.DefaultClass;
import org.junit.Test;

public class PluginTest {

	@Test
	public void test() {
		DefaultClass c = new DefaultClass();
		
		assertTrue("yay!", c.returnSomeValue() == 1);
		
//		fail("Not yet implemented");
	}

}
