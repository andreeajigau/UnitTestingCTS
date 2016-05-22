package unitTesting;

import java.sql.SQLException;

import controller.UserController;
import junit.framework.TestCase;

public class TestUserController extends TestCase {
	
	String username=null;
	String parola=null;
	UserController uc;

	protected void setUp() throws Exception {
		System.out.println("Incepe test");
		super.setUp();
		username="jigaua";
		parola="jigaua";
		uc=new UserController();
	}

	protected void tearDown() throws Exception {
		System.out.println("Sfarsit test");
		super.tearDown();
	}
	
	public void testareVerifyUserValoriCorecte() throws Exception{
	
		try {
			boolean verificare=uc.verifyUser(username, parola);
			assertEquals("User si parola incorecte!",true, verificare);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
	
	public void testareVerifyUsernameNull() throws Exception{
		username=null;
		try {
			boolean verificare=uc.verifyUser(username, parola);
			fail("Nu se accepta null");
		} catch (Exception e) {
			
		}
	}
	
	public void testareVerifyParolaNull(){
		parola=null;
		try {
			boolean verificare=uc.verifyUser(username, parola);
			fail("Nu se accepta null");
		} catch (Exception e) {
			
		}
		
	}
	
	public void testareVerifyUserParolaNULL(){
		username=null;
		parola=null;
		try {
			boolean verificare=uc.verifyUser(username, parola);
			fail("Nu se accepta null");
		} catch (Exception e) {
		
		}
		
	}
	
	public void testareVerifyUserSpatii(){
		username="jigau a";
		try {
			boolean verificare=uc.verifyUser(username, parola);
			fail("Nu introduceti spatii!");
		} catch (Exception e) {
			
		}
		
	}
	
	public void testareVerifyParolaSpatii(){
		parola="jigau a";
		try {
			boolean verificare=uc.verifyUser(username, parola);
			fail("Nu introduceti spatii!");
		} catch (Exception e) {
			
		}
		
	}

}
