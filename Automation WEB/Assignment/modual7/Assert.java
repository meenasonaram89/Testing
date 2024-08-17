package assiment;

import org.junit.Test;

public class Assert {
	
	
		@Test
		public void test1() {
			System.out.println("test1 running");
		}
		@Test
		public void test2() {
			System.out.println("Test2 running");
			int a[]= {1,2,3,4,5,6,7,8};
			int b[]= {1,2,3,4,5};
		org.junit.Assert.assertArrayEquals(a,b);
		junit.framework.Assert.assertFalse(false);

		}
		@Test
		public void test3() {
			System.out.println("test 3 running");
			
		
			

		}
}
