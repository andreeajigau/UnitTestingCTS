package unitTesting;



import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestSuiteSectii extends TestCase {

	public static Test suite(){
		TestSuite colectie=new TestSuite();
		colectie.addTestSuite(TestSectiiConstructor.class);
		colectie.addTestSuite(TestSectiiGetSet.class);
		return colectie;
	}

}
