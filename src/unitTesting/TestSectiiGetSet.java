package unitTesting;

import junit.framework.TestCase;
import model.Sectii;

public class TestSectiiGetSet extends TestCase {
	
	Sectii sectii; 
	int idSectie;
	String nume;
	String tipSectie;
	int costuriAdministrative;

	public TestSectiiGetSet(String name) throws Exception {
		super(name);
		idSectie=1;
		nume="Alergologie";
		tipSectie="medical";
		costuriAdministrative=500;
		sectii=new Sectii(idSectie, nume, tipSectie, costuriAdministrative);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testIdSectie() throws Exception{
		
		int idSetat=2;
		sectii.setIdSectie(idSetat);
		assertEquals("Probleme la setare id", idSetat, sectii.getIdSectie());
	}

	public void testSetIdValMinima(){
		int idMinim=Integer.MIN_VALUE;
		try{
		sectii.setIdSectie(idMinim);
		fail("Nu se accepta sub 1");
		}catch(Exception e){
			
		}
	}
	
	public void testSetIdValPesteMaxim(){
		int idPesteMaxim=100;
		try{
			sectii.setIdSectie(idPesteMaxim);
			fail("Nu se accepta peste 95");
			}catch(Exception e){
				
			}
	}
	
	public void testSetIdValNull(){
		int idNull=0;
		try{
			sectii.setIdSectie(idNull);
			fail("Nu se accepta 0");
			}catch(Exception e){
				
			}
	}
	
	public void testSetNumeValNormale() throws Exception{
		String numeNormal="Pediatrie";
		sectii.setNume(numeNormal);
		assertEquals("Nume setat gresit", numeNormal, sectii.getNume());
	}
	
	public void testSetNumeValoareNull(){
		String numeNull=null;
		try{
		sectii.setNume(numeNull);
		fail("Nu se accepta null");
		}catch(Exception e){
			
		}
		
	}
	public void testSetNumeInexistent(){
		String nume="";
		try{
			sectii.setNume(nume);
			fail("Nu se accepta camp gol");
			}catch(Exception e){
				
			}
	}
	public void testSetTipNormal() throws Exception{
		String tip="chirurgical";
		sectii.setTipSectie(tip);
		assertEquals("Tip setat gresit", tip, sectii.getTipSectie());
	}
	
	public void testSetTipAlteValori(){
		String tip="altceva";
		try{
		sectii.setTipSectie(tip);
		fail("Se accepta doar medical si chirurgical");
		}catch(Exception e){
			
		}
		
	}
	
	public void testSetTipNull(){
		String tip=null;
		try{
			sectii.setTipSectie(tip);
			fail("Nu se accepta null");
			}catch(Exception e){
				
			}
		
	}
	
	public void testSetCosturiNormal() throws Exception{
		int costuri=800;
		sectii.setCosturiAdministrative(costuri);
		assertEquals("Setter gresit", costuri, sectii.getCosturiAdministrative());
	}
	
	public void testSetCosturiNull(){
		int costuri=0;
		try{
			sectii.setCosturiAdministrative(costuri);
			fail("Nu se accepta 0");
		}
		catch(Exception e){
			
		}
	}
	

	
}
