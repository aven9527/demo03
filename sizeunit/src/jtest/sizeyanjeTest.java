package jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class sizeyanjeTest {
	sizeyanje test=new sizeyanje();

	@Before
	public void setUp() throws Exception {
		System.out.println("测试开始之前");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("测试结束");
	}

	@Test
	public void testAdd() {
		int result=test.add(2, 6);
		assertEquals(8,result);
	}

	@Test
	public void testJian() {
		int result=test.jian(4, 2);
		assertEquals(8,result);
		
	}

	@Test
	public void testCheng() {
		int result=test.cheng(1, 2);
		assertEquals(2,result);
	}

	@Test
	public void testChu() {
		int result=test.chu(4, 2);
		assertEquals(2,result);
	}
	@Test
	public void bei10(){
		int result=test.chu(20, 10);
		assertEquals(2,result);
	}
	@Test
	public void bei7(){
		int result=test.chu(20, 7);
		assertEquals(2,result);
}
}
