package unitTesting;

import junit.framework.TestCase;
import model.Clinici;

public class TestCliniciGetSet extends TestCase {
	
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
		clinica=new Clinici(idClinica, nume, adresa, telefon, email, chirieLunara, costUtilitati);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetIdNormal() throws Exception{
		int idNou=2;
		clinica.setIdClinica(idNou);
		assertEquals("Id-ul nu a fost setat", idNou, clinica.getIdClinica());	
	
	}
	
	public void testSetIdZero(){
		int idNou=0;
		try{
			clinica.setIdClinica(idNou);
			fail("Nu se accepta 0");
		}catch(Exception e){
			
		}
	}
	
	public void testSetIdMinim(){
		int idNou=Integer.MIN_VALUE;
		try{
			clinica.setIdClinica(idNou);
			fail("Nu se accepta decat 1,2 sau 3");
		}catch(Exception e){
			
		}
	}
	
	public void testSetIdPesteMaxim(){
		int idNou=7;
		try{
			clinica.setIdClinica(idNou);
			fail("Nu se accepta decat 1,2 sau 3");
		}catch(Exception e){
			
		}
	}
	
	public void testSetNumeNormal() throws Exception{
		String numeNou="Clinica Lujerului";
		clinica.setNume(numeNou);
		assertEquals("Numele nu a fost setat", numeNou, clinica.getNume());
		
	}
	
	public void testSetNumeNull(){
		String numeNou=null;
		try{
			clinica.setNume(numeNou);
			fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testSetNumeInexistent(){
		String numeNou="";
		try{
			clinica.setNume(numeNou);
			fail("Nu se accepta nume inexistent");
		}catch(Exception e){
			
		}
	}
	
	public void testSetAdresaNormal() throws Exception{
		String adresaNoua="adresa noua";
		clinica.setAdresa(adresaNoua);
		assertEquals("Adresa nu a fost setata", adresaNoua, clinica.getAdresa());
	}
	
	public void testSetAdresaNull(){
		String adresaNoua=null;
		try{
			clinica.setAdresa(adresaNoua);
			fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	
	public void testSetAdresaInexistenta(){
		String adresaNoua="";
		try{
			clinica.setAdresa(adresaNoua);
			fail("Nu se accepta camp necompletat");
		}catch(Exception e){
			
		}
	}
	
	public void testSetTelefonNormal() throws Exception{
		String telefonNou="07558126274";
		clinica.setTelefon(telefonNou);
		assertEquals("Adresa nu a fost setata", telefonNou, clinica.getTelefon());
	}
	
	public void testSetTelefonNull(){
		String telefonNou=null;
		try{
			clinica.setTelefon(telefonNou);;
			fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testSetTelefonInexistent(){
		String telefonNou="";
		try{
			clinica.setTelefon(telefonNou);;
			fail("Nu se accepta camp necompletat");
		}catch(Exception e){
			
		}
	}
	
	public void testSetTelefonSpatii(){
		String telefonNou="07 55812627";
		try{
			clinica.setTelefon(telefonNou);;
			fail("Numar gresit");
		}catch(Exception e){
			
		}
	}
	public void testSetTelefonLungime(){
		String telefonNou="0755";
		try{
			clinica.setTelefon(telefonNou);;
			fail("Numar gresit");
		}catch(Exception e){
			
		}
	}
	
	public void testSetEmailNormal() throws Exception{
		String emailNou="lujerului@gmail.com";
		clinica.setEmail(emailNou);
		assertEquals("Email-ul nu a fost setat", emailNou, clinica.getEmail());
	}
	
	public void testSetEmailNull(){
		String emailNou=null;
		try{
			clinica.setEmail(emailNou);
			fail("Email gresit");
		}catch(Exception e){
			
		}
	}
	
	public void testSetEmailInexistent(){
		String emailNou="";
		try{
			clinica.setEmail(emailNou);
			fail("Email gresit");
		}catch(Exception e){
			
		}
	}
	
	public void testSetEmailGresit(){
		String emailNou="baneasa.gmail.com";
		try{
			clinica.setEmail(emailNou);
			fail("Email gresit");
		}catch(Exception e){
			
		}
	}
	
	public void testChirieNormal() throws Exception{
		int chirieLunaraNoua=1000;
		clinica.setChirieLunara(chirieLunaraNoua);
		assertEquals("Chiria nu a fost setata", chirieLunaraNoua, clinica.getChirie_lunara());
	}
	
	public void testChirieNull(){
		int chirieLunaraNoua=0;
		try{
			clinica.setChirieLunara(chirieLunaraNoua);;
			fail("Chirie gresita");
		}catch(Exception e){
			
		}
	}
	
	public void testChirieMaxim(){
		int chirieLunaraNoua=Integer.MAX_VALUE;
		try{
			clinica.setChirieLunara(chirieLunaraNoua);;
			fail("Chirie gresita");
		}catch(Exception e){
			
		}
	}
	public void testCostNormal() throws Exception{
		int costUtilitatiNou=1000;
		clinica.setCostUtilitati(costUtilitatiNou);
		assertEquals("Costul nu a fost setata", costUtilitatiNou, clinica.getCostUtilitati());
	}
	
	public void testCostNull(){
		int costUtilitatiNou=0;
		try{
			clinica.setCostUtilitati(costUtilitatiNou);
			fail("Cost gresit");
		}catch(Exception e){
			
		}
	}
	
	public void testCostmaxim(){
		int costUtilitatiNou=Integer.MAX_VALUE;
		try{
			clinica.setCostUtilitati(costUtilitatiNou);
			fail("Cost gresit");
		}catch(Exception e){
			
		}
	}
	
}
