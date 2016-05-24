package unitTesting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteVerificari extends TestCase {
	
	public static Test suite(){
		TestSuite colectie=new TestSuite();
		
		colectie.addTestSuite(TestConsultatiiController.class);
		colectie.addTestSuite(TestUserController.class);
		colectie.addTestSuite(TestCalculProfit.class);
		colectie.addTestSuite(TestStrategieCosturi.class);
		colectie.addTestSuite(TestNumeLuna.class);
		colectie.addTestSuite(TestProgramController.class);	
		colectie.addTest(TestSuiteSectii.suite());
		colectie.addTest(new TestFisaConsultatie("testSimptomeNimic"));
		colectie.addTest(new TestFisaConsultatie("testInvestigatiiNimic"));
		colectie.addTest(new TestFisaConsultatie("testDiagnosticNimic"));
		colectie.addTest(new TestFisaConsultatie("testTrtmBoalaBazaNimic"));
		colectie.addTest(new TestFisaConsultatie("testRecomandariNimic"));
		colectie.addTest(new TestFisaConsultatie("testTarifPesteMaxim"));
		colectie.addTest(new TestFisaConsultatie("testFisaConcediuAltaValoare"));
		colectie.addTest(new TestFisaConsultatie("testFisaLocAltaValoare"));	
		colectie.addTest(TestSuiteClinici.suite());
		
		return colectie;
	}

}
