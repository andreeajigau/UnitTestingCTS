package unitTesting;

import java.sql.SQLException;

import controller.ProgramController;
import junit.framework.TestCase;

public class TestProgramController extends TestCase {

	ProgramController programController;
	int idDoctor;
	String zi;
	
	protected void setUp() throws Exception {
		super.setUp();
		programController=new ProgramController();
		idDoctor=3;
		zi="Lu";
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetOreValoriNormale() throws Exception{
		int[] ore=new int[]{8,9,10,11,12};
		int[] valori=programController.getOreByDay(idDoctor, zi);
		for(int i=0;i<valori.length;i++){
			if(ore[i]!=valori[i])
				fail("Program incorect!");
		}
	}
	
	public void testGetOreValoareMinId() {
		idDoctor=Integer.MIN_VALUE;
		try{
		int[] valori=programController.getOreByDay(idDoctor, zi);
		fail("Nu se accepta valori sub 1 pentru id");
		} catch(Exception e){
			
		}
	}
	
	public void testGetOreValoarePesteMaximId(){
		idDoctor=120;
		try{
			int[] valori=programController.getOreByDay(idDoctor, zi);
			fail("Nu se accepta valori peste 116");
			} catch(Exception e){
				
			}
	}
	
	public void testOreValoareGresitaZi(){
		String zi="Sa";
		try{
			int[] valori=programController.getOreByDay(idDoctor, zi);
			fail("Valoare gresita pentru zi");
			} catch(Exception e){
				
			}
	}
	
	public void testGetOreIdNull(){
		idDoctor=0;
		try{
			int[] valori=programController.getOreByDay(idDoctor, zi);
			fail("Nu se accepta 0");
			} catch(Exception e){
				
			}
	}
	
	public void testGetOreZiNull(){
		zi=null;
		try{
			int[] valori=programController.getOreByDay(idDoctor, zi);
			fail("Nu se accepta null pentru zi");
			} catch(Exception e){
				
			}
	}
	
	public void testGetOreTime() throws Exception{
	     long start=System.currentTimeMillis()/1000;
	     int[] valori=programController.getOreByDay(idDoctor, zi);
	     long sfarsit=System.currentTimeMillis()/1000;
	     assertTrue("Prea mult timp!", sfarsit-start<2.0);
	}

}
