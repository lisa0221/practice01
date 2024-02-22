package org.tutorial.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTestPractice {
    public static String TEST_STRING = "";

    @BeforeClass
    public static void beforeClass() {
        TEST_STRING = "BEFORE STRING";
        System.out.println("~~~~~before class~~~~~");
    }

    @Before
    public void before() {
        System.out.println("===before===");
    }

    @Test
    public void test1() {
        System.out.println("test1: " + TEST_STRING);
    }

    @Test
    public void test2() {
        System.out.println("test2: " + TEST_STRING);
    }

    @After
    public void after() {
        System.out.println("===after===");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("~~~~~after class~~~~~");
    }
}
