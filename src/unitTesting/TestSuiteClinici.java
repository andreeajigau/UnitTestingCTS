package unitTesting;



import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteClinici extends TestCase {
	
	public static Test suite(){
		TestSuite colectie=new TestSuite();
		colectie.addTestSuite(TestCliniciConstructor.class);
		colectie.addTestSuite(TestCliniciGetSet.class);
		return colectie;
		
	}

}
