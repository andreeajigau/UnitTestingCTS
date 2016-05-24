package unitTesting;

import java.sql.SQLException;

import controller.CliniciController;
import junit.framework.TestCase;

public class TestCliniciController extends TestCase {

	CliniciController cliniciController;
	String numeClinica;
	protected void setUp() throws Exception {
		super.setUp();
		numeClinica="Clinica Baneasa";
		cliniciController=new CliniciController();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetNumeNormal() throws Exception{
		int id=1;
		int valoare=cliniciController.getIdByName(numeClinica);
		assertEquals("Id incorect", id, valoare);
	}
	
	public void testGetIdNumeNull(){
		numeClinica=null;
		try{
			int valoare=cliniciController.getIdByName(numeClinica);
			fail("Nu se poate introduce null");
		}catch(Exception e){
			
		}
	}
	
	public void testGetIdNumeInexistent(){
		numeClinica="";
		try{
			int valoare=cliniciController.getIdByName(numeClinica);
			fail("Nu se accepta camp necompletat");
		}catch(Exception e){
			
		}
	}

	public void testGetIdNumeIncepeGresit(){
		numeClinica="baneasa";
		try{
			int valoare=cliniciController.getIdByName(numeClinica);
			fail("Numele trebuie sa inceapa cu 'Clinica'");
		}catch(Exception e){
			
		}
	}
	
	public void testGetIdNumeLiteraMare(){
		numeClinica="Clinica baneasa";
		try{
			int valoare=cliniciController.getIdByName(numeClinica);
			fail("Dupa cuvantul Clinica incepeti cu litera mare");
		}catch(Exception e){
			
		}
	}
	
	public void testGetIdNumeCaractere(){
		numeClinica="Cliica?! baneasa;";
		try{
			int valoare=cliniciController.getIdByName(numeClinica);
			fail("Nu introduceti caractere!");
		}catch(Exception e){
			
		}
	}
	
	public void testGetIdTimp() throws Exception{
		long start=System.currentTimeMillis()/1000;
		int valoare=cliniciController.getIdByName(numeClinica);
		long sfarsit=System.currentTimeMillis()/1000;
		assertTrue("Prea mult timp!", sfarsit-start<2.0);
	}
	
	public void testGetIdInverseRelationship() throws Exception{
		String nume="Clinica Baneasa";
		//TODO: mai gandeste aici
		int valoare=cliniciController.getIdByName(nume);
		assertTrue("Nu e 2!", 2!=valoare);
		assertTrue("Nu e 3!", 3!=valoare);
	}
	
}
