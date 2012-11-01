package com.flyingh.app;

import junit.framework.Assert;

import org.junit.Test;

public class Demo {
	@Test
	public void test() {
		Assert.assertTrue('\t' < ' ');
	}
}
