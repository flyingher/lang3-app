package com.flyingh.app;

import junit.framework.Assert;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Demo {
	@Test
	public void test3(){
		System.out.println(StringUtils.strip("a a b c \t"));
		System.out.println(StringUtils.strip("a a b c \t", " "));
		System.out.println(StringUtils.stripStart("abcde", "a"));
		System.out.println(StringUtils.stripStart("aaabcde", "a"));
		System.out.println(StringUtils.stripStart("aaabcde", "adcb"));
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
