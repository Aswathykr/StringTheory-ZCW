package rocks.zipcode.stringsgalore;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTheoryTest {
    StringTheory st = null;

    @org.junit.Before
    public void setUp() throws Exception {
        this.st = new StringTheory();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    @Test
    public void getCurrentDateAndTimeTest()
    {
        System.out.println(StringTheory.getCurrentDateAndTime());
    }
    @Test
    public void getChatAtTest()
    {
        Character retrived = StringTheory.getChatAt("Java Exercises!",0 );
        Assert.assertEquals(retrived, 'J');
    }
    @Test
    public void getChatAtTest2()
    {
        Character retrived = StringTheory.getChatAt("Java Exercises!",10 );
        Assert.assertEquals(retrived, 'i');
    }
    @Test
    public void getCharUniCodeAtTest()
    {
        int retrived = StringTheory.getCharUniCodeAt("w3resource.com",1 );
        Assert.assertEquals(retrived, 51);
    }
    @Test
    public void getCharUniCodeAtTest2()
    {
        int retrived = StringTheory.getCharUniCodeAt("w3resource.com",9 );
        Assert.assertEquals(retrived, 101);
    }

    @Test
    public void getUniCodeBeforeIndexTest()
    {
        int retrived = StringTheory.getUniCodeBeforeIndex("w3resource.com",1 );
        Assert.assertEquals(retrived, 119);
    }

    @Test
    public void getUniCodeBeforeIndexTest2()
    {
        int retrived = StringTheory.getUniCodeBeforeIndex("w3resource.com",9 );
        Assert.assertEquals(retrived, 99);
    }
    @Test
    public void compareTest()
    {
        String retrived = StringTheory.compare("This is Exercise 1","This is Exercise 2");
        Assert.assertEquals(retrived, "This is Exercise 1 is less than This is Exercise 2");
    }
    @Test
    public void compareIgnoreCaseTest()
    {
        Boolean retrived = StringTheory.compareIgnoreCase("This is Exercise 1","This is exercise 1");
        Assert.assertTrue(retrived);
    }
    @Test
    public void concatTest()
    {
        String retrived = StringTheory.concat("PHP Exercises and ","Python Exercises");
        Assert.assertEquals(retrived, "PHP Exercises and Python Exercises");
    }
    @Test
    public void containsTest()
    {
        Boolean retrived = StringTheory.contains("PHP Exercises and Python Exercises ","and");
        Assert.assertTrue(retrived);
    }
    @Test
    public void compareToEqualTest()
    {
        Boolean retrived = StringTheory.compareToEqual("example.com","example.com");
        Assert.assertTrue(retrived);
    }
    @Test
    public void compareToEqualTest2()
    {
        Boolean retrived = StringTheory.compareToEqual("example.com","Example.com");
        Assert.assertFalse(retrived);
    }
    @Test
    public void compareToEqualStringBufferTest()
    {
        Boolean retrived = StringTheory.compareToEqual("example.com",new StringBuffer("example.com"));
        Assert.assertTrue(retrived);
    }
    @Test
    public void compareToEqualStringBufferTest2()
    {
        Boolean retrived = StringTheory.compareToEqual("example.com",new StringBuffer("Example.com"));
        Assert.assertFalse(retrived);
    }
}