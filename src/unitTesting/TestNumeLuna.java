package unitTesting;

import junit.framework.TestCase;
import view.ManagerFrame;

public class TestNumeLuna extends TestCase {

	
	ManagerFrame managerFrame;
	int nrLuna;
	
	protected void setUp() throws Exception {
		super.setUp();
		managerFrame=new ManagerFrame();
		nrLuna=3;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testNumeValoriNormale() throws Exception{
		String nume="Ma";
		String valoare=managerFrame.getNumeLuna(nrLuna);
		assertEquals("Nume incorect", nume, valoare);
	}
	
	public void testNumeValoareMinima(){
		nrLuna=Integer.MIN_VALUE;
		try{
			String valoare=managerFrame.getNumeLuna(nrLuna);
			fail("Nu se accepta decat valori intre 1-12");
		}catch(Exception e){
			
		}
	}
	
	public void testNumeValoarePesteMaxim(){
		nrLuna=15;
		try{
			String valoare=managerFrame.getNumeLuna(nrLuna);
			fail("Nu se accepta decat valori intre 1-12");
		}catch(Exception e){
			
		}
	}
	
	public void testNumeValoareMaxima(){
		nrLuna=Integer.MAX_VALUE;
		try{
			String valoare=managerFrame.getNumeLuna(nrLuna);
			fail("Nu se accepta decat valori intre 1-12");
		}catch(Exception e){
			
		}
	}
	
	public void testNumeValoareNula(){
		nrLuna=0;
		try{
			String valoare=managerFrame.getNumeLuna(nrLuna);
			fail("Nu se accepta 0");
		}catch(Exception e){
			
		}
		
	}
	
	public void testNumeTimp() throws Exception{
		long start=System.currentTimeMillis()/1000;
		String valoare=managerFrame.getNumeLuna(nrLuna);
		long sfarsit=System.currentTimeMillis()/1000;
		assertTrue("Prea mult timp!", sfarsit-start<1.0);
		
	}
}
