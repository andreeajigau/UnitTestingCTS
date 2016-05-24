package unitTesting;

import junit.framework.TestCase;
import model.Sectii;

public class TestSectiiConstructor extends TestCase {

	Sectii sectii; 
	int idSectie;
	String nume;
	String tipSectie;
	int costuriAdministrative;
	
	
	public TestSectiiConstructor(String name) {
		super(name);
		idSectie=1;
		nume="Alergologie";
		tipSectie="medical";
		costuriAdministrative=500;
		
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConstructorValoriNormale() throws Exception{
		sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
		assertEquals("Verificare id", idSectie, sectii.getIdSectie());
		assertEquals("Verificare nume", nume, sectii.getNume());
		assertEquals("Verificare tip", tipSectie, sectii.getTipSectie());
		assertEquals("Verificare costuri", costuriAdministrative, sectii.getCosturiAdministrative());
		
	}
	
	public void testConstructorIdSubMinim(){
		idSectie=Integer.MIN_VALUE;
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Id-ul nu poate fi sub 1");
		}
		catch(Exception e){
			
		}
	}
	
	public void testConstructorIdPesteMaxim(){
		idSectie=100;
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Id-ul nu poate fi peste 95");
		}
		catch(Exception e){
			
		}
	}
	
	public void testConstructorIdNull(){
		idSectie=0;
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Id-ul nu poate fi 0");
		}
		catch(Exception e){
			
		}
	}
	
	public void testConstructorNumeNull(){
		String nume=null;
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Numele nu poate fi null");
		}
		catch(Exception e){
			
		}
	}
	public void testConstructorNumeInexistent(){
		String nume="";
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Introduceti un nume");
		}
		catch(Exception e){
			
		}
	}
	
	public void testConstructorTipSectieNull(){
		String tipSectie=null;
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Lipsa exceptie tip");
		}
		catch(Exception e){
			
		}
	}
	
	public void testTipSectieNecoresp(){
		String tipSectie="altceva";
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Tipul poate fi doar medical sau chirurgical");
		}
		catch(Exception e){
			
		}
	}
	
	public void testCosturiNule(){
		costuriAdministrative=0;
		try{
			sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
			fail("Lipsa exceptie costuri");
		}
		catch(Exception e){
			
		}
	}
	
	public void testConstructorTimp() throws Exception{
		long start=System.currentTimeMillis()/1000;
		sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
		long sfarsit=System.currentTimeMillis()/1000;
		assertTrue("Pre mult timp!", sfarsit-start<1.0);
	}
}
