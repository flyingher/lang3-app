package com.flyingh.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import junit.framework.Assert;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Demo {
	@Test
	public void test6() {
		Assert.assertEquals(0, "abc".indexOf(""));
		Assert.assertEquals(0, "".indexOf(""));
		Assert.assertEquals(0, "".indexOf(""));
		System.out.println("abc".indexOf("", 5));
		Assert.assertEquals(3, "abc".indexOf("", 5));
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
		Assert.assertTrue(StringUtils.isBlank("\t"));
		Assert.assertTrue(Character.isWhitespace('\t'));
	}

	@Test
	public void test() {
		Assert.assertTrue('\t' < ' ');
	}
}
