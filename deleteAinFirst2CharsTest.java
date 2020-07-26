package com.epam.tddjunittask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class deleteAinFirst2CharsTest {
	/*
	 * 1. "ABCD" => "BCD"
	 * 2. "AACD" => "CD"
	 * 3. "BACD" => "BCD"
	 * 4. "BBAA" => "BBAA"
	 * 5. "AABAA" => "BAA"
	 * 6. "AA" => ""
	 * 7. "" => ""
	 * 8. "A" => ""
	 */
	
	DeleteAInString deleteA;
	
	@BeforeEach
	void setUp() {
		deleteA = new DeleteAInString();
	}
	
	@Test
	void test0Chars() {
		assertEquals("",deleteA.del(""));
	}
	
	@Test
	void test2Chars() {
		assertEquals("",deleteA.del("AA"));
		assertEquals("B",deleteA.del("AB"));
		assertEquals("BC",deleteA.del("BC"));
	}
	
	@Test
	void test1Char() {
		assertEquals("",deleteA.del("A"));
		assertEquals("B",deleteA.del("B"));
	}
	
	@Test
	void testnChars() {
		assertEquals("BCD",deleteA.del("ABCD"));
		assertEquals("CD",deleteA.del("AACD"));
		assertEquals("BCD",deleteA.del("BACD"));
		assertEquals("BBAA",deleteA.del("BBAA"));
		assertEquals("BAA",deleteA.del("AABAA"));
	}

}
