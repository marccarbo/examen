import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class masLargoTest {

	@Test
	public void test() {
		try{
			int arr[]={1,2,3,4,5};
			int p=masLargo.MasLargo(arr);
			assertEquals(5,p);
		}
		catch(IllegalArgumentException e){
			fail();
		}
		}
	

@Test
public void test1() {
	try{
		int arr[]={};
		int p=masLargo.MasLargo(arr);
		assertEquals(5,p);
	}
	catch(IllegalArgumentException e){
		fail();
	}
	}
}


