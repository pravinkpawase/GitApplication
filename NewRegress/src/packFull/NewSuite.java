package packFull;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(packFull.ListersProgram.class)
public class NewSuite {
@Test
public void test1() {
	Assert.fail();
	System.out.println("Test1 is Running");
}
@Test(dependsOnMethods= {"test1"})
public void test2() {
	System.out.println("Test2 is Running");
}
@Test
public void test3() {
	System.out.println("Test3 is Running");
}
@Test
public void test4() {
	System.out.println("Test4 is Running");
}
@Test
public void test5() {
	System.out.println("Test5 is Running");
}
@Test
public void test6() {
	System.out.println("Test6 is Running");
}
@Test
public void test7() {
	System.out.println("Test7 is Running");
}
@Test
public void test8() {
	System.out.println("Test8 is Running");
}
@Test
public void test9() {
	System.out.println("Test9 is Running");
}
}
