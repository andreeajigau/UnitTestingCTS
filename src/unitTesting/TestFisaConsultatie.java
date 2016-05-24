package unitTesting;

import java.sql.SQLException;

import junit.framework.TestCase;
import model.ExceptieFisaConsultatie;
import view.FisaConsultatieFrame;

public class TestFisaConsultatie extends TestCase {

	FisaConsultatieFrame fisaConsultatie;
	String simptome;
	String investigatii;
	String diagnostic;
	String boli;
	String trtmBoalaBaza;
	String trtmBoli;
	String recomandari;
	String concediuMedical;
	int tarif;
	String loc;
	
	public TestFisaConsultatie(String name) {
		super(name);
		fisaConsultatie=new FisaConsultatieFrame("necompletat", 2, "doctor", 3, 3, 650);
		simptome="ameteli";
		investigatii="glicemie";
		diagnostic="hipertensiune";
		boli="diabet";
		trtmBoalaBaza="hipotensoare";
		trtmBoli="hipoglicemiante";
		recomandari="tratament conform Rp";
		concediuMedical="nu";
		tarif=200;
		loc="cabinet";
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testFisaValoriNormale() throws Exception{
		boolean isAdaugata=true;
		boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, recomandari, concediuMedical, tarif, loc);
		assertEquals("Fisa nu a fost adaugata", isAdaugata, valoare);
	}
	
	public void testFisaSimptomeNull(){
		simptome=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testFisaInvestigatiiNull(){
		investigatii=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testFisaDiagnosticNull(){
		diagnostic=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testFisaBoliNull(){
		boli=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	public void testFisaTrtmBoalaBazaNull(){
		trtmBoalaBaza=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	public void testFisaTrtmBoliNull() throws Exception{
		trtmBoli=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
			fail("Nu se accepta null");
		}catch(Exception e){
			
		}
		
	
	}
	
	public void testFisaRecomandariNull(){
		recomandari=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testConcediuMedicalNull(){
		concediuMedical=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testFisaTarifNull(){
		tarif=0;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testFisaLocNull(){
		loc=null;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta null");
		}catch(Exception e){
			
		}
	}
	
	public void testFisaConcediuAltaValoare(){
		concediuMedical="Posibil";
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Se accepta doar Da sau Nu");
		}catch(Exception e){
			
		}
	}
	
	
	public void testFisaLocAltaValoare(){
		loc="parc";
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Se accepta doar Domiciliu sau Cabinet");
		}catch(Exception e){
			
		}
	}
	
	public void testTarifMinim(){
		tarif=Integer.MIN_VALUE;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta o valoare asa mica!");
		}catch(Exception e){
			
		}
	}
	
	public void testTarifPesteMaxim(){
		tarif=5000;
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta o valoare mai mare de 3000");
		}catch(Exception e){
			
		}
	}
	
	public void testSimptomeNimic(){
		simptome="";
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta camp gol");
		}catch(Exception e){
			
		}
	}
	
	public void testInvestigatiiNimic(){
		investigatii="";
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta camp gol");
		}catch(Exception e){
			
		}
	}
	
	public void testDiagnosticNimic(){
		diagnostic="";
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta camp gol");
		}catch(Exception e){
			
		}
	}
	
	public void testTrtmBoalaBazaNimic(){
		trtmBoalaBaza="";
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta camp gol");
		}catch(Exception e){
			
		}
	}

	public void testRecomandariNimic(){
		recomandari="";
		try{
			boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, trtmBoalaBaza, trtmBoli, 
					recomandari, concediuMedical, tarif, loc);
		    fail("Nu se accepta camp gol");
		}catch(Exception e){
			
		}
	}
	
	public void testTimp() throws Exception{
		long start=System.currentTimeMillis()/1000;
		boolean valoare=fisaConsultatie.adaugaFisa(simptome, investigatii, diagnostic, boli, 
				trtmBoalaBaza, trtmBoli, recomandari, concediuMedical, tarif, loc);
	  long sfarsit=System.currentTimeMillis()/1000;
	  assertTrue("Pre mult timp!", sfarsit-start<5.0);
		
		
	}
	
	

}
