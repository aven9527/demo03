package jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class yushuTest {
	yushu test=new yushu();

	@Before
	public void setUp() throws Exception {
		System.out.println("测试之前");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("测试之后");
	}

	@Test
	public void testChu10() {
		int result=test.chu10(2);
		assertEquals(2,result);
	}

	@Test
	public void testChu7() {
		int result=test.chu7(13);
		assertEquals(2,result);
	}

}
