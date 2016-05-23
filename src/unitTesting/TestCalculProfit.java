package unitTesting;

import junit.framework.TestCase;
import view.ManagerFrame;

public class TestCalculProfit extends TestCase {

	ManagerFrame managerFrame;
	double incasari;
	double costuri;
	
	protected void setUp() throws Exception {
		super.setUp();
		managerFrame=new ManagerFrame();
		incasari=1500;
		costuri=1000;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCalculProfitValoriNormale() throws Exception{
		double profit=incasari-costuri;
		double valoare=managerFrame.calculProfit(incasari, costuri);		
		assertEquals("Profitul este calculat gresit!", profit, valoare);
	}
	
	public void testCalculValoriNegativeIncasari(){
		incasari=-5;
		try{
			double valoare=managerFrame.calculProfit(incasari, costuri);
			fail("Nu se accepta valori negative pentru incasari!");
		}
		catch(Exception e){
			
		}
		
	}
	
	public void testCalculValoriNegativeCosutir(){
		costuri=-5;
		try{
			double valoare=managerFrame.calculProfit(incasari, costuri);
			fail("nu se accepta valori negative pentru costuri!");
		}
		catch(Exception e){
			
		}
	}
	
	public void testCalculValoriNegative(){
		costuri=-5;
		incasari=-2;
		try{
			double valoare=managerFrame.calculProfit(incasari, costuri);
			fail("nu se accepta valori negative!");
		}
		catch(Exception e){
			
		}
	}
	
	public void testCalculCosturiMari() throws Exception{
		costuri=3000;
		double profit=incasari-costuri;
		double valoare=managerFrame.calculProfit(incasari, costuri);
		assertEquals("Profit calculat gresit!", profit, valoare);
	}
	
	public void testCalculCosturiNule(){
		costuri=0;
		try{
			double valoare=managerFrame.calculProfit(incasari, costuri);
			fail("Costurile nu pot fi 0!!");
			
		}catch(Exception e){
			
		}
	}
	
	public void testCalculProfitTime() throws Exception{
		long start=System.currentTimeMillis()/1000;
		double valoare=managerFrame.calculProfit(incasari, costuri);
		long sfarsit=System.currentTimeMillis()/1000;
		assertTrue("Prea mult timp!", sfarsit-start<1.0);
		
	}
}
