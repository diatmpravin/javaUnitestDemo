package demo.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShouldPrint {
	
	@Test
	public void helloWord() {
		Demo d = new Demo();
		assertEquals("Hello World", d.hello());
	}

}
