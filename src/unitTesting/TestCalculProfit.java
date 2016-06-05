package unitTesting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import junit.framework.TestCase;
import view.ManagerFrame;

public class TestCalculProfit extends TestCase {

	ManagerFrame managerFrame;
	double incasari;
	double costuri;
	FileReader fr=null;
	BufferedReader br=null;
	
	protected void setUp() throws Exception {
		super.setUp();
		managerFrame=new ManagerFrame();
		fr=new FileReader(new File("CalculProfit.txt"));
		br=new BufferedReader(fr);
		String[] valori;
		String linie=br.readLine();
		
			valori=linie.split(" ");
			incasari=Integer.parseInt(valori[0]);
			costuri=Integer.parseInt(valori[1]);
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		br.close();
		fr.close();
	}

	public void testCalculProfitValoriNormale() throws Exception{
		double profit=incasari-costuri;
		double valoare=managerFrame.calculProfit(incasari, costuri);		
		assertEquals("Profitul este calculat gresit!", profit, valoare);
				
	}
	
	public void testCalculValoriNegativeIncasari(){
		//incasari=-5;
		try{	fr=new FileReader(new File("CalculProfit.txt"));
		br=new BufferedReader(fr);
		String[] valori;
		String linie;
		while((linie=br.readLine())!=null){
			valori=linie.split(" ");
			incasari=Integer.parseInt(valori[0]);
			costuri=Integer.parseInt(valori[1]);
			if(incasari<0){
				double valoare=managerFrame.calculProfit(incasari, costuri);
				fail("Nu se accepta valori negative pentru incasari!");
			}
		}
			
		}
		catch(Exception e){
			
		}
		
	}
	
	public void testCalculValoriNegativeCosutir(){
		//costuri=-5;
		try{fr=new FileReader(new File("CalculProfit.txt"));
		br=new BufferedReader(fr);
		String[] valori;
		String linie;
		while((linie=br.readLine())!=null){
			valori=linie.split(" ");
			incasari=Integer.parseInt(valori[0]);
			costuri=Integer.parseInt(valori[1]);
			if(costuri<0){
				double valoare=managerFrame.calculProfit(incasari, costuri);
				fail("nu se accepta valori negative pentru costuri!");
			}
		}
			
		}
		catch(Exception e){
			
		}
	}
	
	public void testCalculValoriNegative(){
		/*costuri=-5;
		incasari=-2;*/
		try{fr=new FileReader(new File("CalculProfit.txt"));
		br=new BufferedReader(fr);
		String[] valori;
		String linie;
		while((linie=br.readLine())!=null){
			valori=linie.split(" ");
			incasari=Integer.parseInt(valori[0]);
			costuri=Integer.parseInt(valori[1]);
			if(costuri<0 && incasari<0){
				double valoare=managerFrame.calculProfit(incasari, costuri);
				fail("nu se accepta valori negative!");
			}
		}
			
		}
		catch(Exception e){
			
		}
	}
	
	public void testCalculCosturiMari() throws Exception{
		//costuri=3000;
		fr=new FileReader(new File("CalculProfit.txt"));
		br=new BufferedReader(fr);
		String[] valori;
		String linie;
		while((linie=br.readLine())!=null){
			valori=linie.split(" ");
			incasari=Integer.parseInt(valori[0]);
			costuri=Integer.parseInt(valori[1]);
			if(incasari<costuri && incasari>0 && costuri>0){
				double profit=incasari-costuri;
				double valoare=managerFrame.calculProfit(incasari, costuri);
				assertEquals("Profit calculat gresit!", profit, valoare);
			}
		}
		
	}
	
	public void testCalculCosturiNule(){
		
		try{fr=new FileReader(new File("CalculProfit.txt"));
		br=new BufferedReader(fr);
		String[] valori;
		String linie;
		while((linie=br.readLine())!=null){
			valori=linie.split(" ");
			incasari=Integer.parseInt(valori[0]);
			costuri=Integer.parseInt(valori[1]);
			if(costuri==0){
				double valoare=managerFrame.calculProfit(incasari, costuri);
				fail("Costurile nu pot fi 0!!");
			}
		}
	
			
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
