package unitTesting;

import junit.framework.TestCase;
import model.StrategieCosturi;

public class TestStrategieCosturi extends TestCase {

	StrategieCosturi strategie;
	double chirie;
	double utilitati;
	double costuriSectie;
	
	protected void setUp() throws Exception {
		super.setUp();
		strategie=new StrategieCosturi();
		chirie=500;
		utilitati=1000;
		costuriSectie=500;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSumaCosturiValoriNormale() throws Exception{
		double suma=chirie+utilitati+costuriSectie;
		double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
		assertEquals("Suma nu este calculata corect!", suma, valoare);
	}
	
	public void testSumaValoareNegativaChirie(){
		chirie=-100;
		
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			fail("Nu se accepta valoare negativa pentru chirie.");
		}catch(Exception e){
			
		}
	}
	
	public void testSumaValNegativaUtilitati(){
		utilitati=-100;
	
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			fail("Nu se accepta valoare negativa pentru utilitati.");
		}catch(Exception e){
			
		}
	}
	
	public void testSumaValNegativaCosturi(){
		costuriSectie=-100;
		
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			fail("Nu se accepta valoare negativa pentru costuri.");
		}catch(Exception e){
			
		}
	}
	
	public void testSumaValoriNegative(){
		chirie=-100;
		utilitati=-100;
		costuriSectie=-100;
		
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			fail("Nu se accepta valoari negative");
		}catch(Exception e){
			
		}
	}
	
	public void testSumaValoriMaxime(){
		chirie=Double.MAX_VALUE;
		utilitati=Double.MAX_VALUE;
		costuriSectie=Double.MAX_VALUE;
		double suma=chirie+utilitati+costuriSectie;
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			assertEquals("NU", suma, valoare);
			
		}catch(Exception e){
			
		}
	}
	
	public void testSumaChirieNull(){
		chirie=0;
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			fail("Nu se accepta 0 pentru chirie");
		}catch(Exception e){
			
		}
		
	}
	public void testSumaUtilitatiNull(){
		utilitati=0;
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			fail("Nu se accepta 0 pentru utilitati");
		}catch(Exception e){
			
		}
		
	}
	
	public void testSumaCosturiNull(){
		costuriSectie=0;
		try{
			double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
			fail("Nu se accepta 0 pentru costuri");
		}catch(Exception e){
			
		}
		
	}
	
	public void testSumaTimp() throws Exception{
		long start=System.currentTimeMillis()/1000;	    
		double valoare=strategie.sumaCosturi(chirie, utilitati, costuriSectie);
	    long sfarsit=System.currentTimeMillis()/1000;	 
	    assertTrue("Prea mult timp!", sfarsit-start<1.0);
		
	}
}
