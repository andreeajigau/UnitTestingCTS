package unitTesting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.Timer;

import controller.ConsultatiiController;
import junit.framework.TestCase;

public class TestConsultatiiController extends TestCase {
	
	ConsultatiiController consultatii;
	int luna;
	int idSectie;
	FileReader fr=null;
	BufferedReader br=null;
	

	protected void setUp() throws Exception {
		super.setUp();
		
		consultatii=new ConsultatiiController();
		fr=new FileReader(new File("ConsultatiiController.txt"));
	     br=new BufferedReader(fr);
	     String linie=null;
	     String[] valori;
	     while((linie=br.readLine())!=null){
	    	 valori=linie.split(" ");
	    	 luna=Integer.parseInt(valori[0]);
	    	 idSectie=Integer.parseInt(valori[1]);
	    	 	     
	     }
		
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		fr.close();
		br.close();
	}

	public void testNrConsultatiiTime() throws Exception{
	    long start=System.currentTimeMillis()/1000;	    
	    int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);	   
	    long sfarsit=System.currentTimeMillis()/1000;	 
	    assertTrue("Prea mult timp!", sfarsit-start<1.0);
	}
	
	public void testNrConsultatiiValoriCorecte() throws Exception{
		int nr=2;
		int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
		assertEquals("Rezultat incorect!", nr, valoare);
	}
	
	public void testNrConsultatiiMinim() throws Exception{
		int nr=3;
		luna=1;
		idSectie=1;
		int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
		assertEquals("Rezultat incorect!", nr, valoare);
	}
	
	public void testNrSubMinLuna(){
		luna=Integer.MIN_VALUE;
		try{int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
		fail("Valoare gresita!");
		}
		catch(Exception e){
			
		}
	}
	
	public void testNrSubMinSectie(){
		idSectie=Integer.MIN_VALUE;
		try{int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
		fail("Valoare gresita!");
		}
		catch(Exception e){
			
		}
	}
	
	public void testNrPesteMaxLuna(){
		luna=13;
		try{int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
		fail("Valoare gresita!");
		}
		catch(Exception e){
			
		}
	}
	
	public void testNrPesteMaxSectie(){
		idSectie=100;
		try{int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
		fail("Valoare gresita!");
		}
		catch(Exception e){
			
		}
	}
	
	
	public void testNrConsultatiiMaxim() throws Exception{
		int nr=0;
		luna=12;
		idSectie=95;
		int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
		assertEquals("Rezultat incorect!", nr, valoare);
	}
	
	public void testNrConsultatiiLunaNull(){
		luna=0;
		try {
			int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
			fail("Nu se accepta 0 pentru luna!");
		} catch (Exception e) {
			
		}
		
	}
	
	public void testNrConsultatiiSectieNull(){
		idSectie=0;
		try {
			int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
			fail("Nu se accepta 0 pentru sectie!");
		} catch (Exception e) {
			
		}
	}
	
	public void testNrConsultatiiLunaSectieNull(){
		luna=0;
		idSectie=0;
		try {
			int valoare=consultatii.nrConsultatiiLunaPerSectie(luna, idSectie);
			fail("Nu se accepta 0 pentru sectie sau luna!");
		} catch (Exception e) {
			
		}
	}
	
	
}
