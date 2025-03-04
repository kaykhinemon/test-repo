package com.jdc.mkt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.trycatch.TryCatchData;

public class TryCatchTest {

	TryCatchData data = new TryCatchData();
	
	@Test
	void testTryWitchFinally() {
		String res  = data.useCheckedwitchTryFinallyAndResource();
		System.out.println(res);
	}
	
	
	//@Test
	void testTryMultiCath() {
		int res1 = data.useUncheckedWithTryMultiCatch(new int[2], "2");
		assertEquals(-1, res1);
		int res2 = data.useUncheckedWithTryMultiCatch(new int[2], "Hello");
		assertEquals(-1, res2);
		
	}

	//@Test
	void testTryCatch() {
		String res1 = data.useUncheckedWithTryCatch(127);
		System.out.println(res1);
		//assertEquals(res1, "ClassCastException");

	}

}
