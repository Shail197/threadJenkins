package ThreadConcept.Thread;

import org.testng.annotations.Test;

public class Tthread {
	
	@Test
	public void thread1() {
		System.out.println("Thread id |" +Thread.currentThread().getId());
	}

	
	@Test
	public void thread2() {
		System.out.println("Thread id |" +Thread.currentThread().getId());
	}
}
