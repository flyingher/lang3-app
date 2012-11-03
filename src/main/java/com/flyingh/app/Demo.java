package com.flyingh.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Demo {
	@Test
	public void test10() {
		System.out.println(Arrays.asList("abc cab  abc".split("\\s+")));
		System.out.println(Arrays.asList(StringUtils.split("abc cab  abc")));
		System.out.println(Arrays.asList(StringUtils.split("abc.cab.bca", '.')));
		System.out.println(Arrays.asList(StringUtils.split("a..b.c", '.')));//[a, b, c]
		System.out.println(Arrays.asList("a:b:c:".split(":")));
	}

	@Test
	public void test9() {
		assertTrue(StringUtils.equals("a",
				StringUtils.substringBefore("abc", "bc")));
		assertTrue(StringUtils.equals("bc",
				StringUtils.substringAfter("abc", "a")));
		assertEquals("ab", StringUtils.substringBeforeLast("abbc", "b"));
		assertEquals("c", StringUtils.substringAfterLast("abbc", "b"));
		assertEquals("cc", StringUtils.substringBetween("abccba", "b"));
		assertEquals("abc",
				StringUtils.substringBetween("xabcyxcbay", "x", "y"));
	}

	@Test
	public void test8() {
		assertTrue(StringUtils.equals("a", StringUtils.left("abc", 1)));
		assertTrue(StringUtils.equals("ab", StringUtils.right("cab", 2)));
		assertTrue(StringUtils.equals("a", StringUtils.mid("cab", 1, 1)));
	}

	@Test
	public void test7() {
		assertTrue(StringUtils.contains("", ""));
		assertTrue(StringUtils.contains("abc", "bc"));
	}

	@Test
	public void test6() {
		assertEquals(0, "abc".indexOf(""));
		assertEquals(0, "".indexOf(""));
		assertEquals(0, "".indexOf(""));
		System.out.println("abc".indexOf("", 5));
		assertEquals(3, "abc".indexOf("", 5));
	}

	@Test
	public void test5() {
		String[] strs = { " abc", "cab ", " cba\t" };
		System.out.println(Arrays.asList(strs));
		StringUtils.stripAll(strs);
		System.out.println(Arrays.asList(strs));
		strs = StringUtils.stripAll(strs);
		System.out.println(Arrays.asList(strs));

	}

	@Test
	public void test4() {
		assertEquals("cc", StringUtils.strip("abccba", "ab"));
		assertEquals("ccba", StringUtils.stripStart("abccba", "ab"));
		assertEquals("abcc", StringUtils.stripEnd("abccba", "ab"));
		assertEquals(" abc", StringUtils.strip(" abcxyz", "xyz"));
		assertEquals(null, StringUtils.strip(null));
		assertEquals(null, StringUtils.strip(null, "*"));
		assertEquals("", StringUtils.strip("", "*"));
		assertEquals("13", StringUtils.stripEnd("135.55", ".5"));
	}

	@Test
	public void test3() {
		System.out.println(StringUtils.strip("a a b c \t"));
		System.out.println(StringUtils.strip("a a b c \t", " "));
		System.out.println(StringUtils.stripStart("abcde", "a"));
		System.out.println(StringUtils.stripStart("aaabcde", "a"));
		System.out.println(StringUtils.stripStart("aaabcde", "adcb"));
		String str = " abc\t";
		assertTrue(str.length() == 5);
		assertTrue(StringUtils.strip(str).length() == 3);
	}

	@Test
	public void test2() {
		assertTrue(StringUtils.isBlank("\t"));
		assertTrue(Character.isWhitespace('\t'));
	}

	@Test
	public void test() {
		assertTrue('\t' < ' ');
	}
}
