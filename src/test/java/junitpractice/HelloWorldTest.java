package junitpractice;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HelloWorldTest {
	 @Test
	  public void saysHello() {
		HelloWorld HelloWorld = new HelloWorld();
	    assertEquals("hello world",HelloWorld.sayHelloWorld());
	 }
}