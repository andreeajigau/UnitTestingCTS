package unitTesting;

import junit.framework.TestCase;
import model.Clinici;

public class TestCliniciConstructor extends TestCase {

	Clinici clinica;
	int idClinica;
	String nume;
	String adresa;
	String telefon;
	String email;
	int chirieLunara;
	int costUtilitati;
	
	protected void setUp() throws Exception {
		super.setUp();
		idClinica=1;
		nume="Clinica Baneasa";
		adresa="Bucuresti, Strada x";
		email="baneasa@gmail.com";
		telefon="0755841025";
		chirieLunara=500;
		costUtilitati=500;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConstructorValoriNormale() throws Exception{
		clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
		assertEquals("Verificare id", idClinica, clinica.getIdClinica());
		assertEquals("Verificare nume", nume, clinica.getNume());
		assertEquals("Verificare adresa", adresa, clinica.getAdresa());
		assertEquals("Verificare telefon", telefon, clinica.getTelefon());
		assertEquals("Verificare email", email, clinica.getEmail());
		assertEquals("Verificare chirie", chirieLunara, clinica.getChirie_lunara());
		assertEquals("Verificare cost", costUtilitati, clinica.getCostUtilitati());
	}
	
	public void testConstructorIdMinim(){
		idClinica=Integer.MIN_VALUE;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta decat 1, 2 sau 3");
		} catch(Exception e){
			
		}
	}
	
	public void testConstructorIdNull(){
		idClinica=0;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta 0");
		} catch(Exception e){
			
		}
	}
	
	public void testConstructorIdPesteMax(){
		idClinica=5;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta decat 1, 2 sau 3");
		} catch(Exception e){
			
		}
	}
	
	public void testNumeNull(){
		nume=null;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta null");
		} catch(Exception e){
			
		}
	}
	
	public void testNumeInexistent(){
		nume="";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta camp gol");
		} catch(Exception e){
			
		}
	}
	
	public void testAdresaNull(){
		adresa=null;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta null");
		} catch(Exception e){
			
		}
	}
	
	public void testAdresaInexistent(){
		adresa="";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta camp gol");
		} catch(Exception e){
			
		}
	}
	
	public void testTelefonNull(){
		telefon=null;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta null");
		} catch(Exception e){
			
		}
	}
	public void testTelefonInexistent(){
		telefon="";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta camp gol");
		} catch(Exception e){
			
		}
	}
	
	public void testTelefonSpatii(){
		telefon="07 554878";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta spatii!");
		} catch(Exception e){
			
		}
	}
	
	public void testTelefonLungime(){
		telefon="074";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Numar telefon introdus gresit!");
		} catch(Exception e){
			
		}
	}
	
	public void testEmailNull(){
		email=null;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta null");
		} catch(Exception e){
			
		}
		
	}
	
	public void testEmailInexistent(){
		email="";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta camp gol");
		} catch(Exception e){
			
		}
	}
	
	public void testEmailSpatii(){
		email="bane sa@gmail.com";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Nu se accepta spatii");
		} catch(Exception e){
			
		}
	}
	
	public void testEmailGresit(){
		email="baneasa.gmail.com";
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Email gresit");
		} catch(Exception e){
			
		}
	}
	
	public void testChirieNull(){
		chirieLunara=0;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Chiria nu poate sa fie 0");
		} catch(Exception e){
			
		}
	}
	
	public void testCostUtilitatiNull(){
		costUtilitati=0;
		try{
			clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
			fail("Utilitatile nu pot sa fie 0");
		} catch(Exception e){
			
		}
	}
}
